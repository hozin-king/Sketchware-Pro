package mod.hey.studios.project.stringfog;

import com.google.gson.Gson;

import java.util.HashMap;

import a.a.a.ProjectBuilder;
import mod.hey.studios.util.Helper;
import mod.jbk.build.BuildProgressReceiver;
import pro.sketchware.utility.FileUtil;

public class StringfogHandler {

    private static final String DEFAULT_KEY = "UTF-8";

    /**
     * Minimum recommended key length. Shorter keys still work (old projects
     * keep building) but trigger a warning, they are never silently rejected.
     */
    public static final int MIN_RECOMMENDED_KEY_LENGTH = 8;

    private final String config_path;

    public StringfogHandler(String sc_id) {
        config_path = FileUtil.getExternalStorageDir().concat("/.sketchware/data/" + sc_id + "/stringfog");

        if (!FileUtil.isExistFile(config_path)) FileUtil.writeFile(config_path, getDefaultConfig());
    }

    private static String getDefaultConfig() {
        HashMap<String, String> config = new HashMap<>();
        config.put("enabled", "false");
        config.put("key", DEFAULT_KEY);

        return new Gson().toJson(config);
    }

    private HashMap<String, String> readConfig() {
        if (!FileUtil.isExistFile(config_path)) return new HashMap<>();
        try {
            HashMap<String, String> config =
                    new Gson().fromJson(FileUtil.readFile(config_path), Helper.TYPE_STRING_MAP);
            return config != null ? config : new HashMap<>();
        } catch (Exception e) {
            return new HashMap<>();
        }
    }

    private void writeConfig(HashMap<String, String> config) {
        FileUtil.writeFile(config_path, new Gson().toJson(config));
    }

    public boolean isStringfogEnabled() {
        String enabledValue = readConfig().get("enabled");
        return "true".equals(enabledValue);
    }

    public void setStringfogEnabled(boolean enabled) {
        HashMap<String, String> config = readConfig();
        config.put("enabled", Boolean.valueOf(enabled).toString());

        writeConfig(config);
    }

    /**
     * Custom encryption key typed by the user. Falls back to "UTF-8"
     * (the historical default) when unset, preserving old behavior.
     */
    public String getKey() {
        String key = readConfig().get("key");
        return (key == null || key.isEmpty()) ? DEFAULT_KEY : key;
    }

    public void setKey(String key) {
        HashMap<String, String> config = readConfig();
        config.put("key", (key == null || key.isEmpty()) ? DEFAULT_KEY : key);

        writeConfig(config);
    }

    /**
     * @return true if the project still uses the historical default key.
     * The default key is public knowledge, so it gives almost no protection.
     */
    public boolean isUsingDefaultKey() {
        return DEFAULT_KEY.equals(getKey());
    }

    /**
     * @return true if the key is custom and at least MIN_RECOMMENDED_KEY_LENGTH
     * characters long. Weak keys are warned about, never silently rejected,
     * so old projects keep building.
     */
    public boolean isKeyStrong() {
        String key = getKey();
        return key != null && !DEFAULT_KEY.equals(key) && key.length() >= MIN_RECOMMENDED_KEY_LENGTH;
    }

    /**
     * Check if StringFog is enabled for the project, and run it if it is.
     */
    public void start(BuildProgressReceiver progressReceiver, ProjectBuilder builder) {
        if (isStringfogEnabled()) {
            if (isUsingDefaultKey()) {
                progressReceiver.onProgress("Warning: StringFog uses the default encryption key (\"UTF-8\") - "
                        + "anyone can decrypt your strings. Set a custom key in the StringFog manager.", 14);
            } else if (!isKeyStrong()) {
                progressReceiver.onProgress("Warning: StringFog encryption key is shorter than "
                        + MIN_RECOMMENDED_KEY_LENGTH + " characters - use a longer key for real protection.", 14);
            }
            progressReceiver.onProgress("Running StringFog...", 14);
            builder.runStringfog(getKey());
        }
    }
}
