package com.github.megatronking.stringfog.plugin;

import com.github.megatronking.stringfog.IKeyGenerator;
import com.github.megatronking.stringfog.IStringFog;
import com.github.megatronking.stringfog.plugin.kg.HardCodeKeyGenerator;
import com.github.megatronking.stringfog.xor.StringFogImpl;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import mod.jbk.util.LogUtil;

public class StringFogInjector {

    /**
     * Wrapper class generated into the user's compiled classes. The ASM visitor
     * rewrites string constants into calls to
     * {@code StringFog.decrypt(String base64Value, String base64Key)}, but the
     * stock {@code StringFogImpl} only has {@code decrypt(byte[], byte[])}.
     * Without this wrapper the app crashes with NoSuchMethodError on launch
     * (white screen). The wrapper Base64-decodes both arguments with
     * {@code android.util.Base64} (always present on Android) and delegates to
     * {@code StringFogImpl.decrypt(byte[], byte[])}.
     */
    private static final String WRAPPER_CLASS_DOTTED = "com.github.megatronking.stringfog.xor.StringFog";
    private static final String WRAPPER_CLASS_INTERNAL = "com/github/megatronking/stringfog/xor/StringFog";
    private static final String IMPL_CLASS_INTERNAL = "com/github/megatronking/stringfog/xor/StringFogImpl";

    public static void processDirectory(File compiledClassesDir, File mappingFile, String key) {
        try {
            IStringFog stringFogImpl = new StringFogImpl();
            String effectiveKey = (key == null || key.isEmpty()) ? "UTF-8" : key;
            IKeyGenerator keyGenerator = new HardCodeKeyGenerator(effectiveKey);
            List<String> logs = new ArrayList<>();
            String fogClassName = WRAPPER_CLASS_DOTTED;

            if (compiledClassesDir.exists() && compiledClassesDir.isDirectory()) {
                // The wrapper must exist before the transform runs, and it must
                // not be transformed itself.
                writeWrapperClass(compiledClassesDir);

                Path baseDirPath = compiledClassesDir.toPath();
                try (Stream<Path> stream = Files.walk(baseDirPath)) {
                    stream.filter(path -> path.toString().endsWith(".class"))
                          .forEach(path -> {
                              try {
                                  String relativePath = baseDirPath.relativize(path).toString();
                                  String className = relativePath.replace(File.separatorChar, '/');
                                  // Never fog the StringFog runtime classes themselves.
                                  if (className.startsWith("com/github/megatronking/stringfog/")) {
                                      return;
                                  }
                                  if (className.endsWith(".class")) {
                                      className = className.substring(0, className.length() - 6);
                                  }

                                  byte[] byteCode = Files.readAllBytes(path);
                                  ClassReader reader = new ClassReader(byteCode);
                                  ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);

                                  ClassVisitor visitor = ClassVisitorFactory.create(
                                          stringFogImpl, logs, new String[0], keyGenerator,
                                          fogClassName, className, StringFogMode.base64, writer
                                  );

                                  reader.accept(visitor, ClassReader.EXPAND_FRAMES);
                                  Files.write(path, writer.toByteArray());
                              } catch (Exception e) {
                                  LogUtil.e("StringFog", "Failed to fog class: " + path, e);
                              }
                          });
                }
            }

            if (mappingFile != null) {
                File dir = mappingFile.getParentFile();
                if (dir != null && (dir.exists() || dir.mkdirs())) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(mappingFile))) {
                        writer.write("stringfog impl: " + WRAPPER_CLASS_DOTTED);
                        writer.newLine();
                        writer.write("stringfog runtime: com.github.megatronking.stringfog.xor.StringFogImpl");
                        writer.newLine();
                        writer.write("stringfog mode: base64");
                        writer.newLine();
                        for (String log : logs) {
                            writer.write(log);
                            writer.newLine();
                        }
                    }
                }
            }
        } catch (Exception e) {
            LogUtil.e("StringFog", "Failed to run StringFog", e);
        }
    }

    /**
     * Writes the {@code StringFog} wrapper class into the user's compiled
     * classes directory. Equivalent to:
     * <pre>
     * package com.github.megatronking.stringfog.xor;
     * public final class StringFog {
     *     public static String decrypt(String value, String key) {
     *         byte[] v = android.util.Base64.decode(value, android.util.Base64.DEFAULT);
     *         byte[] k = android.util.Base64.decode(key, android.util.Base64.DEFAULT);
     *         return new StringFogImpl().decrypt(v, k);
     *     }
     * }
     * </pre>
     */
    private static void writeWrapperClass(File compiledClassesDir) {
        try {
            File outFile = new File(compiledClassesDir, WRAPPER_CLASS_INTERNAL + ".class");
            File parent = outFile.getParentFile();
            if (parent != null && !parent.exists() && !parent.mkdirs()) {
                LogUtil.e("StringFog", "Failed to create wrapper class dir: " + parent, null);
                return;
            }
            Files.write(outFile.toPath(), generateWrapperBytecode());
        } catch (Exception e) {
            LogUtil.e("StringFog", "Failed to write StringFog wrapper class", e);
        }
    }

    private static byte[] generateWrapperBytecode() {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(Opcodes.V1_8,
                Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL,
                WRAPPER_CLASS_INTERNAL,
                null,
                "java/lang/Object",
                null);

        MethodVisitor ctor = cw.visitMethod(Opcodes.ACC_PRIVATE, "<init>", "()V", null, null);
        ctor.visitCode();
        ctor.visitVarInsn(Opcodes.ALOAD, 0);
        ctor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        ctor.visitInsn(Opcodes.RETURN);
        ctor.visitMaxs(0, 0);
        ctor.visitEnd();

        MethodVisitor mv = cw.visitMethod(
                Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                "decrypt",
                "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                null,
                null);
        mv.visitCode();
        // byte[] v = android.util.Base64.decode(value, Base64.DEFAULT);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETSTATIC, "android/util/Base64", "DEFAULT", "I");
        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "android/util/Base64", "decode",
                "(Ljava/lang/String;I)[B", false);
        mv.visitVarInsn(Opcodes.ASTORE, 2);
        // byte[] k = android.util.Base64.decode(key, Base64.DEFAULT);
        mv.visitVarInsn(Opcodes.ALOAD, 1);
        mv.visitFieldInsn(Opcodes.GETSTATIC, "android/util/Base64", "DEFAULT", "I");
        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "android/util/Base64", "decode",
                "(Ljava/lang/String;I)[B", false);
        mv.visitVarInsn(Opcodes.ASTORE, 3);
        // return new StringFogImpl().decrypt(v, k);
        mv.visitTypeInsn(Opcodes.NEW, IMPL_CLASS_INTERNAL);
        mv.visitInsn(Opcodes.DUP);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, IMPL_CLASS_INTERNAL, "<init>", "()V", false);
        mv.visitVarInsn(Opcodes.ALOAD, 2);
        mv.visitVarInsn(Opcodes.ALOAD, 3);
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, IMPL_CLASS_INTERNAL, "decrypt",
                "([B[B)Ljava/lang/String;", false);
        mv.visitInsn(Opcodes.ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        cw.visitEnd();
        return cw.toByteArray();
    }
}
