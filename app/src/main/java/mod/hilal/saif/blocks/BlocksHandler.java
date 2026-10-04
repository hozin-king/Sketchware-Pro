package mod.hilal.saif.blocks;

import androidx.annotation.ColorInt;

import com.besome.sketch.editor.LogicEditorActivity;

import java.util.ArrayList;
import java.util.HashMap;

import mod.hilal.saif.activities.tools.ConfigActivity;
import pro.sketchware.R;
import pro.sketchware.blocks.ExtraBlocks;
import pro.sketchware.utility.ThemeUtils;

public class BlocksHandler {

    public static void builtInBlocks(ArrayList<HashMap<String, Object>> arrayList) {
        ExtraBlocks.extraBlocks(arrayList);

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "CommandBlockJava");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "/*-JX4UA2y_f1OckjjvxWI.bQwRei-sLEsBmds7ArsRfi0xSFEP3Php97kjdMCs5ed\n"
                        + ">[%1$s]\n"
                        + ">%2$s\n"
                        + ">%3$s\n"
                        + ">%4$s\n"
                        + ">%5$s\n"
                        + "%6$s\n"
                        + "BpWI8U4flOpx8Ke66QTlZYBA_NEusQ7BN-D0wvZs7ArsRfi0.EP3Php97kjdMCs*/");
        hashMap.put("color", "#493F5A");
        hashMap.put("palette", "0");
        hashMap.put(
                "spec",
                "Java Command Block: reference %s distance %d frontend %d backend %d command"
                        + " %m.Command");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "CommandBlockXML");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "/*AXAVajPNTpbJjsz-NGVTp08YDzfI-04kA7ZsuCl4GHqTQQiuWL45sV6Vf4gwK\n"
                        + ">[%1$s]\n"
                        + ">%2$s\n"
                        + ">%3$s\n"
                        + ">%4$s\n"
                        + ">%5$s\n"
                        + ">%6$s\n"
                        + "%7$s\n"
                        + "Ui5_PNTJb21WO6OuGwQ3psk3su1LIvyXo_OAol-kVQBC5jtN_DcPLaRCJ0yXp*/");
        hashMap.put("color", "#493F5A");
        hashMap.put("palette", "0");
        hashMap.put(
                "spec",
                "XML Command Block: reference %s distance %d frontend %d backend %d command"
                        + " %m.Command xml name %s.inputOnly");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "viewOnClick");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "%s.setOnClickListener(new View.OnClickListener() {\n"
                        + "@Override\n"
                        + "public void onClick(View _view) {\n"
                        + "%s\n"
                        + "}\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "When %m.view clicked");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRecyclerViewLayoutParams");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "RecyclerView.LayoutParams _lp = new"
                        + " RecyclerView.LayoutParams(ViewGroup.LayoutParams.%s,"
                        + " ViewGroup.LayoutParams.%s);\n"
                        + "_view.setLayoutParams(_lp);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "7");
        hashMap.put(
                "spec", "set RecyclerViewLayoutParams width %m.LayoutParam height %m.LayoutParam");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "refreshingList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.invalidateViews();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.listview invalidate views");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ListViewAddHeader");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addHeaderView(%s,%s,%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.listview add Header view %m.view data %s selectable? %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ListViewAddFooter");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addFooterView(%s,%s,%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.listview add Footer view %m.view data %s selectable? %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listViewRemoveHeader");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeHeaderView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.listview remove Header %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listViewRemoveFooter");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeFooterView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.listview remove Footer %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogCreate");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s = new ProgressDialog(%s.this);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "%m.progressdialog Create in %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listViewSetSelection");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setSelection((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "%m.listview set selection %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextdiableSuggestion");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext disable suggestions");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextLines");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setLines(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext set lines %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSingleLine");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setSingleLine(%2$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext singleLine? %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextShowError");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).setError(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext show error %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSelectAll");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).selectAll();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext select all text");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSetSelection");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).setSelection((int)%s, (int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext set selection start %d end %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EditTextSetMaxLines");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "((EditText)%s).setMaxLines((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext set max lines %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EdittextGetselectionStart");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getSelectionStart()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext get selection start");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "EdittextGetselectionEnd");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getSelectionEnd()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.edittext get selection end");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "performClick");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.performClick();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "0");
        hashMap.put("spec", "%m.view performClick");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "AsyncTaskExecute");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "new %s().execute(%s);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "%m.asynctask execute message %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "AsyncTaskPublishProgress");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "publishProgress((int)%s);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "publish progress %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetCanceledOutside");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setCanceledOnTouchOutside(%s);");
        hashMap.put("color", "#29A7E4");
        hashMap.put("palette", "7");
        hashMap.put("spec", "%m.progressdialog setCancelableWhenTouchOutside %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "datePickerDialogShow");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "DialogFragment datePicker = new DatePickerFragment();\r\n"
                        + "datePicker.show(getSupportFragmentManager(), \"datePicker\");");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "DatePickerDialog show");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timePickerDialogShow");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.show();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.timepickerdialog show");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "imageCrop");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.CropImage(this, %s, (int) %s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "CropImageView fromFilePath %s RequestCode %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "isConnected");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.isConnected(getApplicationContext())");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "isConnected");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customImport");
        hashMap.put("type", " ");
        hashMap.put("code", "import %s;");
        hashMap.put("color", "#EE7D15");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "import %s.import");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customImport2");
        hashMap.put("type", " ");
        hashMap.put("code", "import %s;");
        hashMap.put("color", "#EE7D15");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "import %m.import");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customToast");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "SketchwareUtil.CustomToast(getApplicationContext(), %s, %s, %s, %s, %s,"
                        + " SketchwareUtil.%s);");
        hashMap.put("color", "#8A55D7");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "CustomToast %s textColor %m.color textSize %d bgColor %m.color cornerRadius %d"
                        + " gravity %m.gravity_t");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "customToastWithIcon");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "SketchwareUtil.CustomToastWithIcon(getApplicationContext(), %s, %s, %s, %s, %s,"
                        + " SketchwareUtil.%s, R.drawable.%s);");
        hashMap.put("color", "#8A55D7");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "CustomToastWithIcon %s textColor %m.color textSize %d bgColor %m.color"
                        + " cornerRadius %d gravity %m.gravity_t Icon %m.resource");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "LightStatusBar");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);\r\n"
                        + "getWindow().setStatusBarColor(0xFFFFFFFF);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "LightStatusBar");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hideKeyboard");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.hideKeyboard(getApplicationContext());");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "Hide keyboard");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "showKeyboard");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.showKeyboard(getApplicationContext());");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "Show keyboard");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetTitle");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTitle(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog setTitle %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetMessage");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setMessage(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog setMessage %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetMax");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setMax((int)%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog setMax %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetProgress");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setProgress((int)%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog setProgress %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetCancelable");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCancelable(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog setCancelable %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetCanceled");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCanceledOnTouchOutside(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog setCanceledOnTouchOutside %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogSetStyle");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setProgressStyle(ProgressDialog.%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog setProgressStyle %m.styleprogress");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogDismiss");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.dismiss();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog dismiss");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "progressdialogShow");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.show();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.progressdialog show");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "startService");
        hashMap.put("type", " ");
        hashMap.put("code", "startService(new Intent(getApplicationContext(), %s.class));");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "startService %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stopService");
        hashMap.put("type", " ");
        hashMap.put("code", "stopService(new Intent(getApplicationContext(), %s.class));");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "stopService %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sendBroadcast");
        hashMap.put("type", " ");
        hashMap.put("code", "sendBroadcast(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "sendBroadcast %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "startActivityWithChooser");
        hashMap.put("type", " ");
        hashMap.put("code", "startActivity(Intent.createChooser(%s, %s));");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "StartActivity %m.intent with Chooser %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "finishAffinity");
        hashMap.put("type", "f");
        hashMap.put("code", "finishAffinity();");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "Finish Affinity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ternaryString");
        hashMap.put("type", "s");
        hashMap.put("code", "%s ? %s : %s");
        hashMap.put("color", "#E1A928");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%b ? %s : %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ternaryNumber");
        hashMap.put("type", "d");
        hashMap.put("code", "%s ? (int)%s : (int)%s");
        hashMap.put("color", "#E1A928");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%b ? %d : %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "forLoopIncrease");
        hashMap.put("type", "c");
        hashMap.put("code", "for (%s = %s; %s; %s++) {\r\n%s\r\n}");
        hashMap.put("color", "#E1A928");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "for %m.varInt = %d; %b; %m.varInt++");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "notifyDataSetChanged");
        hashMap.put("type", " ");
        hashMap.put("code", "notifyDataSetChanged();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "RefreshData");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getLastVisiblePosition");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getLastVisiblePosition()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.listview getLastVisiblePosition");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listscrollparam");
        hashMap.put("type", "d");
        hashMap.put("code", "ListView.%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.listscrollparam");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuInflater");
        hashMap.put("type", " ");
        hashMap.put("code", "getMenuInflater().inflate(R.menu.%s, menu);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "Menu get menu from file %m.menu");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuAddItem");
        hashMap.put("type", " ");
        hashMap.put("code", "menu.add(0, %s, 0, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "Menu add id %d title %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuAddMenuItem");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "MenuItem %1$s = menu.add(Menu.NONE, %2$s, Menu.NONE, %3$s);\r\n"
                        + "%1$s.setIcon(R.drawable.%4$s);\r\n"
                        + "%s.setShowAsAction(MenuItem.%5$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.menuitem add id %d title %s icon %m.resource showAsAction %m.menuaction");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "menuAddSubmenu");
        hashMap.put("type", "c");
        hashMap.put("code", "SubMenu %s = menu.addSubMenu(%s);\r\n%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "Menu add %m.submenu title %s;");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "submenuAddItem");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.add(0, %s, 0, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.submenu add id %d title %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getAssetFile");
        hashMap.put("type", " ");
        hashMap.put("code", "java.io.InputStream %s = getAssets().open(%s);");
        hashMap.put("color", "#A1887F");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.inputstream getFileFromAsset path %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "renameFile");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\n"
                        + "java.io.File dYx4Y = new java.io.File(%1$s);\n"
                        + "java.io.File e5Cyk = new java.io.File(%2$s);\n"
                        + "dYx4Y.renameTo(e5Cyk);\n"
                        + "}");
        hashMap.put("color", "#A1887F");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "rename file path %s to %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "copyAssetFile");
        hashMap.put("type", "s");
        hashMap.put("code", "SketchwareUtil.copyFromInputStream(%s)");
        hashMap.put("color", "#A1887F");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.inputstream to String");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sortListmap");
        hashMap.put("type", " ");
        hashMap.put("code", "SketchwareUtil.sortListMap(%s, %s, %s, %s);");
        hashMap.put("color", "#CC5B21");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "sort %m.listMap key %s isNumber %b isAscending %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "deleteMapFromListmap");
        hashMap.put("type", "a");
        hashMap.put("code", "%2$s.remove(%1$s);");
        hashMap.put("color", "#CC5B21");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "delete %m.varMap of %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "html");
        hashMap.put("type", "s");
        hashMap.put("typeName", "");
        hashMap.put("code", "Html.fromHtml(%s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "html %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "reverse");
        hashMap.put("type", "s");
        hashMap.put("code", "new StringBuilder(%s).reverse().toString()");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "reverse %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "toHashCode");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.hashCode()");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "toHashCode %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringMatches");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.matches(%s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%s matches RegExp %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringReplaceFirst");
        hashMap.put("type", "s");
        hashMap.put("code", "%s.replaceFirst(%s, %s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%s replace first RegExp %s with %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringReplaceAll");
        hashMap.put("type", "s");
        hashMap.put("code", "%s.replaceAll(%s, %s)");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%s replace all RegExp %s with %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "stringSplitToList");
        hashMap.put("type", " ");
        hashMap.put("code", "%3$s = new ArrayList<String>(Arrays.asList(%1$s.split(%2$s)));");
        hashMap.put("color", "#5CB721");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "split %s RegExp %s into %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "mapContainValue");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.containsValue(%s)");
        hashMap.put("color", "#EE7D15");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.varMap contain value %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getHeight");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getHeight()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view getHeight");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getWidth");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.getWidth()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view getWidth");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "removeView");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view removeView %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "removeViews");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.removeAllViews();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view removeAllViews");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addView");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view addView %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addViews");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.addView(%s, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view addView %m.view index %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setGravity");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setGravity(Gravity.%s | Gravity.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view setGravity %m.gravity_v %m.gravity_h");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setImageIdentifier");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setImageResource(getResources().getIdentifier(%s, \"drawable\","
                        + " getPackageName()));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.imageview set image by name %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setImageCustomRes");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setImageResource(R.drawable.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.imageview setImage %m.image");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getRating");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getRating()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.ratingbar getRating");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRating");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRating((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.ratingbar setRating%d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setNumStars");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setNumStars((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.ratingbar setNumStars %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setStepSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStepSize((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.ratingbar setStepSize %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetIs24Hour");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setIs24HourView(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.timepicker setIs24Hour %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetCurrentHour");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCurrentHour((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.timepicker setCurrentHour %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetCurrentMinute");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCurrentMinute((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.timepicker setCurrentMinute%d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetHour");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setHour((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.timepicker setHour %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "timepickerSetMinute");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setMinute((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.timepicker setMinute%d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "autoComSetData");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setAdapter(new ArrayAdapter<String>(getBaseContext(),"
                        + " android.R.layout.simple_list_item_1, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.actv setListData %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setThreshold");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setThreshold(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mactv setThreshold %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTokenizer");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mactv CommaTokenizer");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "multiAutoComSetData");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setAdapter(new ArrayAdapter<String>(getBaseContext(),"
                        + " android.R.layout.simple_list_item_1, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mactv setListData %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listSetSelector");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSelector(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.listview setSelector %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.gridview setGridCustomViewData %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetNumColumns");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setNumColumns((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.gridview setNumColumns %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetColumnWidth");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setColumnWidth((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.gridview setColumnWidth %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetVerticalSpacing");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setVerticalSpacing((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.gridview setVerticalSpacing %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetHorizontalSpacing");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setHorizontalSpacing((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.gridview setHorizontalSpacing %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "gridSetStretchMode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStretchMode(GridView.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.gridview setStretchMode %m.gridstretchmode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewSetVideoUri");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setVideoURI(Uri.parse(%s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview setVideoUri %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewStart");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.start();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview start");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewPause");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.pause();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview pause");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewStop");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.stopPlayback();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview stopPlayback");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewIsPlaying");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.isPlaying()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview isPlaying");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewCanPause");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.canPause()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview canPause");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewCanSeekForward");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.canSeekForward()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview canSeekForward");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewCanSeekBackward");
        hashMap.put("type", "b");
        hashMap.put("code", "%s.canSeekBackward()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview canSeekBackward");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewGetDuration");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getDuration()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview getDuration");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "videoviewGetCurrentPosition");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getCurrentPosition()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.videoview getCurrentPosition");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listSetTranscriptMode");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setTranscriptMode(ListView.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.listview setTranscriptMode %m.transcriptmode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "listSetStackFromBottom");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s.setStackFromBottom(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.listview setStackFromBottom %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setElevation");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setElevation((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view setElevation %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTextSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTextSize((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textview setTextSize %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setColorFilterView");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.getBackground().setColorFilter(%s, PorterDuff.Mode.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view setColorFilter %m.color with %m.porterduff");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCornerRadiusView");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a,"
                        + " int b) { this.setCornerRadius(a); this.setColor(b); return this; }"
                        + " }.getIns((int)%s, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view setCornerRadius %d color %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setGradientBackground");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new"
                        + " int[] {%s,%s}));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view setGradientBackground %m.color and %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setStrokeView");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a,"
                        + " int b, int c) { this.setStroke(a, b); this.setColor(c); return this; }"
                        + " }.getIns((int)%s, %s, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view setStroke %d strokeColor %m.color bgColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRadiusAndStrokeView");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a,"
                        + " int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c);"
                        + " this.setColor(d); return this; } }.getIns((int)%s, (int)%s, %s, %s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.view setCornerRadius %d stroke %d strokeColor %m.color bgColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "showSnackbar");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "com.google.android.material.snackbar.Snackbar.make(%s, %s,"
                        + " com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction(%s,"
                        + " new View.OnClickListener(){\r\n"
                        + "@Override\r\n"
                        + "public void onClick(View _view) {\r\n"
                        + "%s\r\n"
                        + "}\r\n"
                        + "}).show();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view showSnackbar text %s actionText %s onClick");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addTab");
        hashMap.put("type", " ");
        hashMap.put("code", "%1$s.addTab(%1$s.newTab().setText(%2$s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout addTabTitle %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setupWithViewPager");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setupWithViewPager(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout setupWithViewPager %m.viewpager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setInlineLabel");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setInlineLabel(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout setInlineLabel %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTabTextColors");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTabTextColors(%s, %s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout setTabTextColors Normal %m.color Selected %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setTabRippleColor");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setTabRippleColor(new android.content.res.ColorStateList(new int[][]{new"
                        + " int[]{android.R.attr.state_pressed}}, \r\n\r\n"
                        + "new int[] {%s}));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout setTabRippleColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setSelectedTabIndicatorColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSelectedTabIndicatorColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout setSelectedTabIndicatorColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setSelectedTabIndicatorHeight");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSelectedTabIndicatorHeight(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.tablayout setSelectedTabIndicatorHeight %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnTitle");
        hashMap.put("type", "f");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return Title %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnFragment");
        hashMap.put("type", "f");
        hashMap.put("code", "return new %s();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return Fragment %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "bottomMenuAddItem");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.getMenu().add(0, %s, 0, %s).setIcon(R.drawable.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.bottomnavigation add item id %d title %s icon %m.resource");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewSetCode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCode(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.codeview setCode %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewSetTheme");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTheme(Theme.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.codeview setTheme %m.cv_theme");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewSetLanguage");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setLanguage(Language.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.codeview setLanguage %m.cv_language");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "codeviewApply");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.apply();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.codeview apply");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "fabIcon");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "FAB set icon %m.resource");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "fabSize");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "FAB setSize %m.fabsize");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "fabVisibility");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "FAB setVisibility %m.fabvisible");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBgDrawable");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBackgroundDrawable(getResources().getDrawable(R.drawable.%s));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.view setBackgroundDrawable %m.drawable");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCardBackgroundColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCardBackgroundColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.cardview setCardBackgroundColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCardRadius");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRadius((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.cardview setCornerRadius %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCardElevation");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCardElevation((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.cardview setCardElevation %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setPreventCornerOverlap");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setPreventCornerOverlap(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.cardview setPreventCornerOverlap %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setUseCompatPadding");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setUseCompatPadding(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.cardview setUseCompatPadding %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "spnSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.spinner setSpinnerCustomViewData %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetAnimationFromAsset");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setAnimation(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.lottie setAnimationFromAsset %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetAnimationFromJson");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setAnimationFromJson(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.lottie setAnimationFromJson %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetAnimationFromUrl");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setAnimationFromUrl(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.lottie setAnimationFromUrl %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetRepeatCount");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRepeatCount((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.lottie setRepeatCount %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "lottieSetSpeed");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setSpeed((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.lottie setSpeed %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerview setRecyclerCustomViewData %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetLayoutManager");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setLayoutManager(new LinearLayoutManager(this));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerview setLayoutManager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetLayoutManagerHorizontal");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "%s.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,"
                        + " false));");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerview set Horizontal LayoutManager");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSetHasFixedSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setHasFixedSize(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerview setHasFixedSize %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerSmoothScrollToPosition");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.smoothScrollToPosition((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerview smoothScrollToPosition %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerScrollToPositionWithOffset");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                " ((LinearLayoutManager) %s.getLayoutManager()).scrollToPositionWithOffset((int)%s,"
                        + " (int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerview scrollToPosition %d offset %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "recyclerscrollparam");
        hashMap.put("type", "d");
        hashMap.put("code", "RecyclerView.%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.recyclerscrollparam");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerscrollparam");
        hashMap.put("type", "d");
        hashMap.put("code", "ViewPager.%s");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.pagerscrollparam");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetCustomViewData");
        hashMap.put("type", " ");
        hashMap.put("code", "");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.viewpager setPagerCustomViewData %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetFragmentAdapter");
        hashMap.put("type", " ");
        hashMap.put("code", "%2$s.setTabCount(%3$s);\r\n%1$s.setAdapter(%2$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.viewpager setFragmentAdapter %m.fragmentAdapter TabCount %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerGetOffscreenPageLimit");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getOffscreenPageLimit()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.viewpager getOffscreenPageLimit");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetOffscreenPageLimit");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setOffscreenPageLimit((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.viewpager setOffscreenPageLimit %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerGetCurrentItem");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getCurrentItem()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.viewpager getCurrentItem");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "pagerSetCurrentItem");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCurrentItem((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.viewpager setCurrentItem %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "onSwipeRefreshLayout");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {\r\n"
                        + "@Override\r\n"
                        + "public void onRefresh() {\r\n"
                        + "%s\r\n"
                        + "}\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "When %m.swiperefreshlayout refreshed");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setRefreshing");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setRefreshing(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.swiperefreshlayout setRefreshing %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "viewOnLongClick");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnLongClickListener(new View.OnLongClickListener() {\r\n"
                        + "@Override\r\n"
                        + "public boolean onLongClick(View _view) {\r\n"
                        + "%s\r\n"
                        + "return true;\r\n"
                        + "}\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "When %m.view long clicked");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "viewOnTouch");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnTouchListener(new View.OnTouchListener(){\r\n"
                        + "@Override\r\n"
                        + "public boolean onTouch(View _view, MotionEvent _motionEvent){\r\n"
                        + "%s\r\n"
                        + "return true;\r\n"
                        + "}\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "When %m.view touched");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "checkboxOnChecked");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {\r\n"
                        + "@Override\r\n"
                        + "public void onCheckedChanged(CompoundButton cb, boolean isChecked) {\r\n"
                        + "%s\r\n"
                        + "}});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "When %m.checkbox checked");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "checkboxIsChecked");
        hashMap.put("type", "b");
        hashMap.put("code", "isChecked");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "isChecked");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getBadgeCount");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getBadgeCount();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.badgeview getBadgeCount");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeNumber");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBadgeCount(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.badgeview setBadgeNumber %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeString");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBadgeCount(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.badgeview setBadgeString %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeBackground");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBadgeBackground(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.badgeview setBadgeBackground %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeTextColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTextColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.badgeview setBadgeTextColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBadgeTextSize");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setTextSize((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.badgeview setBadgeTextSize %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setCustomLetter");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCustomLetter(new String[]%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.sidebar setCustomLetter String[] %s.inputOnly");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBubbleColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "BubbleLayout %m.view setBubbleColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleStrokeColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStrokeColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "BubbleLayout %m.view setStrokeColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleStrokeWidth");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setStrokeWidth((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "BubbleLayout %m.view setStrokeWidth %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleCornerRadius");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCornersRadius((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "BubbleLayout %m.view setCornerRadius %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleArrowHeight");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setArrowHeight((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "BubbleLayout %m.view setArrowHeight %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleArrowWidth");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setArrowWidth((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "BubbleLayout %m.view setArrowWidth %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setBubbleArrowPosition");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setArrowPosition((float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "BubbleLayout %m.view setArrowPosition %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternToString");
        hashMap.put("type", "s");
        hashMap.put("code", "PatternLockUtils.patternToString(%s, %s)");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview getPattern from %m.listStr to String ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternToMD5");
        hashMap.put("type", "s");
        hashMap.put("code", "PatternLockUtils.patternToMD5(%s, %s)");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview getPattern from %m.listStr to MD5");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternToSha1");
        hashMap.put("type", "s");
        hashMap.put("code", "PatternLockUtils.patternToSha1(%s, %s)");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview getPattern from %m.listStr to SHA1");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetDotCount");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setDotCount((int)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview setDotCount %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetNormalStateColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setNormalStateColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview setNormalStateColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetCorrectStateColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCorrectStateColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview setCorrectStateColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetWrongStateColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setWrongStateColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview setWrongStateColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternSetViewMode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setViewMode(PatternLockView.PatternViewMode.%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview setViewMode %m.patternviewmode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "patternLockClear");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.clearPattern();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.patternview clearPattern");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxBgColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxBackgroundColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setBoxBackgroundColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxStrokeColor");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxStrokeColor(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setBoxStrokeColor %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxBgMode");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setBoxBackgroundMode %m.til_box_mode");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetBoxCornerRadii");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setBoxCornerRadii((float)%s, (float)%s, (float)%s, (float)%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setBoxCornerRadius TL %d TR %d BL %d BR %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetError");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setError(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setError %s ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetErrorEnabled");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setErrorEnabled(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setErrorEnabled %b ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetCounterEnabled");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCounterEnabled(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setCounterEnabled %b ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilSetCounterMaxLength");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setCounterMaxLength(%s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout setCounterMaxLength %d ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tilGetCounterMaxLength");
        hashMap.put("type", "d");
        hashMap.put("code", "%s.getCounterMaxLength()");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.textinputlayout getCounterMaxLength");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "YTPVLifecycle");
        hashMap.put("type", " ");
        hashMap.put("code", "getLifecycle().addObserver(%1$s);");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.youtubeview getLifecycle");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "YTPVSetListener");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "%1$s.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {\r\n"
                        + "  @Override\r\n"
                        + "  public void onReady(@NonNull YouTubePlayer youTubePlayer) {\r\n"
                        + "    String videoId = %2$s;\r\n"
                        + "    youTubePlayer.cueVideo(videoId, 0);\r\n"
                        + "    %3$s\r\n"
                        + "  }\r\n"
                        + "});");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.youtubeview addYouTubePlayerListener VideoID %s");
        arrayList.add(hashMap);

        // ===== Media3PlayerView blocks =====

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSetUrl");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  String _m3url = %2$s;\r\n"
                        + "  String _m3mime = null;\r\n"
                        + "  if (_m3url.contains(\".m3u8\")) _m3mime = MimeTypes.APPLICATION_M3U8;\r\n"
                        + "  else if (_m3url.contains(\".mpd\")) _m3mime = MimeTypes.APPLICATION_MPD;\r\n"
                        + "  MediaItem.Builder _m3mib = new MediaItem.Builder().setUri(_m3url).setMimeType(_m3mime);\r\n"
                        + "  String _m3drm = (String) _m3st.get(\"drm\");\r\n"
                        + "  if (_m3drm != null) { _m3mib.setDrmConfiguration(new MediaItem.DrmConfiguration.Builder(androidx.media3.common.C.WIDEVINE_UUID).setLicenseUri(_m3drm).build()); }\r\n"
                        + "  MediaItem _m3mi = _m3mib.build();\r\n"
                        + "  DefaultHttpDataSource.Factory _m3dsf = new DefaultHttpDataSource.Factory();\r\n"
                        + "  String _m3ua = (String) _m3st.get(\"ua\");\r\n"
                        + "  if (_m3ua != null) _m3dsf.setUserAgent(_m3ua);\r\n"
                        + "  java.util.HashMap _m3props = new java.util.HashMap();\r\n"
                        + "  String _m3ref = (String) _m3st.get(\"ref\");\r\n"
                        + "  if (_m3ref != null) _m3props.put(\"Referer\", _m3ref);\r\n"
                        + "  java.util.HashMap _m3hh = (java.util.HashMap) _m3st.get(\"h\");\r\n"
                        + "  if (_m3hh != null) _m3props.putAll(_m3hh);\r\n"
                        + "  if (!_m3props.isEmpty()) _m3dsf.setDefaultRequestProperties(_m3props);\r\n"
                        + "  MediaSource.Factory _m3msf;\r\n"
                        + "  if (_m3url.contains(\".m3u8\")) _m3msf = new HlsMediaSource.Factory(_m3dsf);\r\n"
                        + "  else if (_m3url.contains(\".mpd\")) _m3msf = new DashMediaSource.Factory(_m3dsf);\r\n"
                        + "  else _m3msf = new ProgressiveMediaSource.Factory(_m3dsf);\r\n"
                        + "  _m3pl.setMediaSource(_m3msf.createMediaSource(_m3mi));\r\n"
                        + "  _m3pl.prepare();\r\n"
                        + "  _m3pl.play();\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set media URL %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSetUrlWithHeaders");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  _m3st.put(\"h\", %3$s);\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  String _m3url = %2$s;\r\n"
                        + "  String _m3mime = null;\r\n"
                        + "  if (_m3url.contains(\".m3u8\")) _m3mime = MimeTypes.APPLICATION_M3U8;\r\n"
                        + "  else if (_m3url.contains(\".mpd\")) _m3mime = MimeTypes.APPLICATION_MPD;\r\n"
                        + "  MediaItem _m3mi = new MediaItem.Builder().setUri(_m3url).setMimeType(_m3mime).build();\r\n"
                        + "  DefaultHttpDataSource.Factory _m3dsf = new DefaultHttpDataSource.Factory();\r\n"
                        + "  String _m3ua = (String) _m3st.get(\"ua\");\r\n"
                        + "  if (_m3ua != null) _m3dsf.setUserAgent(_m3ua);\r\n"
                        + "  java.util.HashMap _m3props = new java.util.HashMap();\r\n"
                        + "  String _m3ref = (String) _m3st.get(\"ref\");\r\n"
                        + "  if (_m3ref != null) _m3props.put(\"Referer\", _m3ref);\r\n"
                        + "  java.util.HashMap _m3hh = (java.util.HashMap) _m3st.get(\"h\");\r\n"
                        + "  if (_m3hh != null) _m3props.putAll(_m3hh);\r\n"
                        + "  if (!_m3props.isEmpty()) _m3dsf.setDefaultRequestProperties(_m3props);\r\n"
                        + "  MediaSource.Factory _m3msf;\r\n"
                        + "  if (_m3url.contains(\".m3u8\")) _m3msf = new HlsMediaSource.Factory(_m3dsf);\r\n"
                        + "  else if (_m3url.contains(\".mpd\")) _m3msf = new DashMediaSource.Factory(_m3dsf);\r\n"
                        + "  else _m3msf = new ProgressiveMediaSource.Factory(_m3dsf);\r\n"
                        + "  _m3pl.setMediaSource(_m3msf.createMediaSource(_m3mi));\r\n"
                        + "  _m3pl.prepare();\r\n"
                        + "  _m3pl.play();\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set media URL %s with headers %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSetUserAgent");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); %1$s.setTag(_m3st); }\r\n"
                        + "  _m3st.put(\"ua\", %2$s);\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set User-Agent %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSetReferer");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); %1$s.setTag(_m3st); }\r\n"
                        + "  _m3st.put(\"ref\", %2$s);\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set Referer %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSetDrm");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); %1$s.setTag(_m3st); }\r\n"
                        + "  _m3st.put(\"drm\", %2$s);\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set Widevine license URL %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pPlay");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) _m3pl.play();\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview play");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pPause");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) _m3pl.pause();\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview pause");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pStop");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) _m3pl.stop();\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview stop");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSeekTo");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) _m3pl.seekTo((long) %2$s);\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview seek to %d ms");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pRelease");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) { _m3pl.release(); _m3st.remove(\"p\"); }\r\n"
                        + "  %1$s.setPlayer(null);\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview release player");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSetVolume");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) _m3pl.setVolume((float) %2$s / 100.0f);\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set volume %d %%");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pSetSpeed");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) _m3pl.setPlaybackSpeed((float) %2$s / 100.0f);\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set speed %d %%");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pIsPlaying");
        hashMap.put("type", "b");
        hashMap.put(
                "code",
                "((java.util.HashMap) %s.getTag()) != null && ((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")) != null && ((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")).isPlaying()");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview is playing");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pGetDuration");
        hashMap.put("type", "d");
        hashMap.put(
                "code",
                "((java.util.HashMap) %s.getTag()) == null ? 0 : (((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")) == null ? 0 : ((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")).getDuration())");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview get duration");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pGetPosition");
        hashMap.put("type", "d");
        hashMap.put(
                "code",
                "((java.util.HashMap) %s.getTag()) == null ? 0 : (((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")) == null ? 0 : ((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")).getCurrentPosition())");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview get position");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pGetBuffered");
        hashMap.put("type", "d");
        hashMap.put(
                "code",
                "((java.util.HashMap) %s.getTag()) == null ? 0 : (((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")) == null ? 0 : ((ExoPlayer) ((java.util.HashMap) %s.getTag()).get(\"p\")).getBufferedPosition())");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview get buffered position");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pOnReady");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  _m3pl.addListener(new Player.Listener() {\r\n"
                        + "    @Override\r\n"
                        + "    public void onPlaybackStateChanged(int _state) {\r\n"
                        + "      if (_state == Player.STATE_READY) {\r\n"
                        + "        %2$s\r\n"
                        + "      }\r\n"
                        + "    }\r\n"
                        + "  });\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview on ready");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pOnBuffering");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  _m3pl.addListener(new Player.Listener() {\r\n"
                        + "    @Override\r\n"
                        + "    public void onPlaybackStateChanged(int _state) {\r\n"
                        + "      if (_state == Player.STATE_BUFFERING) {\r\n"
                        + "        %2$s\r\n"
                        + "      }\r\n"
                        + "    }\r\n"
                        + "  });\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview on buffering");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pOnError");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  _m3pl.addListener(new Player.Listener() {\r\n"
                        + "    @Override\r\n"
                        + "    public void onPlayerError(PlaybackException _error) {\r\n"
                        + "      %2$s\r\n"
                        + "    }\r\n"
                        + "  });\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview on error");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pOnCompleted");
        hashMap.put("type", "c");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  _m3pl.addListener(new Player.Listener() {\r\n"
                        + "    @Override\r\n"
                        + "    public void onPlaybackStateChanged(int _state) {\r\n"
                        + "      if (_state == Player.STATE_ENDED) {\r\n"
                        + "        %2$s\r\n"
                        + "      }\r\n"
                        + "    }\r\n"
                        + "  });\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview on completed");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "m3pPlayChannel");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  final ExoPlayer _m3fpl = _m3pl;\r\n"
                        + "  final java.util.HashMap _m3fst = _m3st;\r\n"
                        + "  java.util.ArrayList<String> _m3urls = new java.util.ArrayList<>();\r\n"
                        + "  _m3urls.add(%2$s);\r\n"
                        + "  String _m3backups = %3$s;\r\n"
                        + "  if (_m3backups != null && !_m3backups.isEmpty()) {\r\n"
                        + "    for (String _u : _m3backups.split(\"\\\\n\")) { if (!_u.trim().isEmpty()) _m3urls.add(_u.trim()); }\r\n"
                        + "  }\r\n"
                        + "  final int[] _m3idx = {0};\r\n"
                        + "  Runnable _m3try = new Runnable() {\r\n"
                        + "    @Override public void run() {\r\n"
                        + "      if (_m3idx[0] >= _m3urls.size()) return;\r\n"
                        + "      String _url = _m3urls.get(_m3idx[0]);\r\n"
                        + "      String _mime = null;\r\n"
                        + "      if (_url.contains(\".m3u8\")) _mime = MimeTypes.APPLICATION_M3U8;\r\n"
                        + "      else if (_url.contains(\".mpd\")) _mime = MimeTypes.APPLICATION_MPD;\r\n"
                        + "      MediaItem _mi = new MediaItem.Builder().setUri(_url).setMimeType(_mime).build();\r\n"
                        + "      DefaultHttpDataSource.Factory _dsf = new DefaultHttpDataSource.Factory();\r\n"
                        + "      String _ua = (String) _m3fst.get(\"ua\");\r\n"
                        + "      if (_ua != null) _dsf.setUserAgent(_ua);\r\n"
                        + "      MediaSource.Factory _msf;\r\n"
                        + "      if (_url.contains(\".m3u8\")) _msf = new HlsMediaSource.Factory(_dsf);\r\n"
                        + "      else if (_url.contains(\".mpd\")) _msf = new DashMediaSource.Factory(_dsf);\r\n"
                        + "      else _msf = new ProgressiveMediaSource.Factory(_dsf);\r\n"
                        + "      _m3fpl.setMediaSource(_msf.createMediaSource(_mi));\r\n"
                        + "      _m3fpl.prepare();\r\n"
                        + "      _m3fpl.play();\r\n"
                        + "    }\r\n"
                        + "  };\r\n"
                        + "  _m3pl.addListener(new Player.Listener() {\r\n"
                        + "    @Override public void onPlayerError(PlaybackException _e) {\r\n"
                        + "      _m3idx[0]++;\r\n"
                        + "      _m3try.run();\r\n"
                        + "    }\r\n"
                        + "  });\r\n"
                        + "  _m3try.run();\r\n"
                        + "}");
        hashMap.put("color", "#FF6D00");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview play channel URL %s with backup URLs %s");
        arrayList.add(hashMap);

        // ===== End Media3PlayerView blocks =====

        // ===== IPTV Playlist blocks =====

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvLoadPlaylist");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  final String _url = %2$s;\r\n"
                        + "  final java.util.ArrayList<java.util.HashMap<String, Object>> _out = %3$s;\r\n"
                        + "  new Thread(new Runnable() {\r\n"
                        + "    @Override public void run() {\r\n"
                        + "      try {\r\n"
                        + "        java.net.URL _u = new java.net.URL(_url);\r\n"
                        + "        java.net.HttpURLConnection _c = (java.net.HttpURLConnection) _u.openConnection();\r\n"
                        + "        _c.setConnectTimeout(15000); _c.setReadTimeout(15000);\r\n"
                        + "        java.io.InputStream _is = _c.getInputStream();\r\n"
                        + "        java.util.Scanner _sc = new java.util.Scanner(_is).useDelimiter(\"\\\\A\");\r\n"
                        + "        String _json = _sc.hasNext() ? _sc.next() : \"\";\r\n"
                        + "        _sc.close(); _is.close();\r\n"
                        + "        org.json.JSONObject _root = new org.json.JSONObject(_json);\r\n"
                        + "        org.json.JSONArray _groups = _root.getJSONArray(\"groups\");\r\n"
                        + "        final java.util.ArrayList<java.util.HashMap<String, Object>> _result = new java.util.ArrayList<>();\r\n"
                        + "        for (int _gi = 0; _gi < _groups.length(); _gi++) {\r\n"
                        + "          org.json.JSONObject _g = _groups.getJSONObject(_gi);\r\n"
                        + "          java.util.HashMap<String, Object> _gm = new java.util.HashMap<>();\r\n"
                        + "          _gm.put(\"name\", _g.optString(\"name\", \"Group \" + (_gi + 1)));\r\n"
                        + "          java.util.ArrayList<java.util.HashMap<String, Object>> _channels = new java.util.ArrayList<>();\r\n"
                        + "          org.json.JSONArray _chArr = _g.optJSONArray(\"channels\");\r\n"
                        + "          if (_chArr != null) {\r\n"
                        + "            for (int _ci = 0; _ci < _chArr.length(); _ci++) {\r\n"
                        + "              org.json.JSONObject _ch = _chArr.getJSONObject(_ci);\r\n"
                        + "              java.util.HashMap<String, Object> _cm = new java.util.HashMap<>();\r\n"
                        + "              _cm.put(\"name\", _ch.optString(\"name\", \"Channel \" + (_ci + 1)));\r\n"
                        + "              _cm.put(\"logo\", _ch.optString(\"logo\", \"\"));\r\n"
                        + "              _cm.put(\"url\", _ch.optString(\"url\", \"\"));\r\n"
                        + "              _cm.put(\"userAgent\", _ch.optString(\"userAgent\", \"\"));\r\n"
                        + "              _cm.put(\"referer\", _ch.optString(\"referer\", \"\"));\r\n"
                        + "              org.json.JSONObject _hdrs = _ch.optJSONObject(\"headers\");\r\n"
                        + "              java.util.HashMap<String, Object> _hm = new java.util.HashMap<>();\r\n"
                        + "              if (_hdrs != null) { java.util.Iterator<String> _keys = _hdrs.keys(); while (_keys.hasNext()) { String _k = _keys.next(); _hm.put(_k, _hdrs.optString(_k, \"\")); } }\r\n"
                        + "              _cm.put(\"headers\", _hm);\r\n"
                        + "              _cm.put(\"drm\", _ch.optString(\"drm\", \"\"));\r\n"
                        + "              _cm.put(\"clearKeyId\", _ch.optString(\"clearKeyId\", \"\"));\r\n"
                        + "              _cm.put(\"clearKey\", _ch.optString(\"clearKey\", \"\"));\r\n"
                        + "              java.util.ArrayList<String> _bu = new java.util.ArrayList<>();\r\n"
                        + "              org.json.JSONArray _buArr = _ch.optJSONArray(\"backupUrls\");\r\n"
                        + "              if (_buArr != null) { for (int _bi = 0; _bi < _buArr.length(); _bi++) _bu.add(_buArr.optString(_bi, \"\")); }\r\n"
                        + "              _cm.put(\"backupUrls\", _bu);\r\n"
                        + "              _channels.add(_cm);\r\n"
                        + "            }\r\n"
                        + "          }\r\n"
                        + "          _gm.put(\"channels\", _channels);\r\n"
                        + "          _result.add(_gm);\r\n"
                        + "        }\r\n"
                        + "        runOnUiThread(new Runnable() {\r\n"
                        + "          @Override public void run() { _out.clear(); _out.addAll(_result); %4$s }\r\n"
                        + "        });\r\n"
                        + "      } catch (final Exception _e) {\r\n"
                        + "        runOnUiThread(new Runnable() {\r\n"
                        + "          @Override public void run() { %5$s }\r\n"
                        + "        });\r\n"
                        + "      }\r\n"
                        + "    }\r\n"
                        + "  }).start();\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview load IPTV playlist from URL %s to %m.listMap on success %m.Command on error %m.Command");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvPlayChannel");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap<String, Object> _ch = %2$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  String _ua = (String) _ch.get(\"userAgent\");\r\n"
                        + "  if (_ua != null && !_ua.isEmpty()) _m3st.put(\"ua\", _ua);\r\n"
                        + "  String _ref = (String) _ch.get(\"referer\");\r\n"
                        + "  if (_ref != null && !_ref.isEmpty()) _m3st.put(\"ref\", _ref);\r\n"
                        + "  java.util.HashMap _hdrs = (java.util.HashMap) _ch.get(\"headers\");\r\n"
                        + "  if (_hdrs != null && !_hdrs.isEmpty()) _m3st.put(\"h\", _hdrs);\r\n"
                        + "  String _drm = (String) _ch.get(\"drm\");\r\n"
                        + "  if (_drm != null && !_drm.isEmpty()) _m3st.put(\"drm\", _drm); else _m3st.remove(\"drm\");\r\n"
                        + "  String _ckId = (String) _ch.get(\"clearKeyId\");\r\n"
                        + "  String _ck = (String) _ch.get(\"clearKey\");\r\n"
                        + "  if (_ckId != null && !_ckId.isEmpty() && _ck != null && !_ck.isEmpty()) { _m3st.put(\"ckid\", _ckId); _m3st.put(\"ck\", _ck); } else { _m3st.remove(\"ckid\"); _m3st.remove(\"ck\"); }\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl == null) { _m3pl = new ExoPlayer.Builder(_m3pv.getContext()).build(); _m3pv.setPlayer(_m3pl); _m3st.put(\"p\", _m3pl); }\r\n"
                        + "  final ExoPlayer _fpl = _m3pl;\r\n"
                        + "  final java.util.HashMap _fst = _m3st;\r\n"
                        + "  java.util.ArrayList<String> _urls = new java.util.ArrayList<>();\r\n"
                        + "  String _mainUrl = (String) _ch.get(\"url\");\r\n"
                        + "  if (_mainUrl != null && !_mainUrl.isEmpty()) _urls.add(_mainUrl);\r\n"
                        + "  java.util.ArrayList<String> _bu = (java.util.ArrayList<String>) _ch.get(\"backupUrls\");\r\n"
                        + "  if (_bu != null) for (String _u : _bu) if (_u != null && !_u.isEmpty()) _urls.add(_u);\r\n"
                        + "  final int[] _idx = {0};\r\n"
                        + "  final Runnable _try = new Runnable() {\r\n"
                        + "    @Override public void run() {\r\n"
                        + "      if (_idx[0] >= _urls.size()) return;\r\n"
                        + "      String _url = _urls.get(_idx[0]);\r\n"
                        + "      String _mime = null;\r\n"
                        + "      if (_url.contains(\".m3u8\")) _mime = MimeTypes.APPLICATION_M3U8;\r\n"
                        + "      else if (_url.contains(\".mpd\")) _mime = MimeTypes.APPLICATION_MPD;\r\n"
                        + "      MediaItem.Builder _mib = new MediaItem.Builder().setUri(_url).setMimeType(_mime);\r\n"
                        + "      String _d = (String) _fst.get(\"drm\");\r\n"
                        + "      String _cid = (String) _fst.get(\"ckid\");\r\n"
                        + "      String _ckv = (String) _fst.get(\"ck\");\r\n"
                        + "      if (_d != null) _mib.setDrmConfiguration(new MediaItem.DrmConfiguration.Builder(androidx.media3.common.C.WIDEVINE_UUID).setLicenseUri(_d).build());\r\n"
                        + "      else if (_cid != null && _ckv != null) _mib.setDrmConfiguration(new MediaItem.DrmConfiguration.Builder(androidx.media3.common.C.CLEARKEY_UUID).setLicenseUri(\"https://example.com\").build());\r\n"
                        + "      DefaultHttpDataSource.Factory _dsf = new DefaultHttpDataSource.Factory();\r\n"
                        + "      String _sua = (String) _fst.get(\"ua\");\r\n"
                        + "      if (_sua != null) _dsf.setUserAgent(_sua);\r\n"
                        + "      java.util.HashMap _props = new java.util.HashMap();\r\n"
                        + "      String _sref = (String) _fst.get(\"ref\");\r\n"
                        + "      if (_sref != null) _props.put(\"Referer\", _sref);\r\n"
                        + "      java.util.HashMap _sh = (java.util.HashMap) _fst.get(\"h\");\r\n"
                        + "      if (_sh != null) _props.putAll(_sh);\r\n"
                        + "      if (!_props.isEmpty()) _dsf.setDefaultRequestProperties(_props);\r\n"
                        + "      MediaSource.Factory _msf;\r\n"
                        + "      if (_url.contains(\".m3u8\")) _msf = new HlsMediaSource.Factory(_dsf);\r\n"
                        + "      else if (_url.contains(\".mpd\")) _msf = new DashMediaSource.Factory(_dsf);\r\n"
                        + "      else _msf = new ProgressiveMediaSource.Factory(_dsf);\r\n"
                        + "      _fpl.setMediaSource(_msf.createMediaSource(_mib.build()));\r\n"
                        + "      _fpl.prepare(); _fpl.play();\r\n"
                        + "    }\r\n"
                        + "  };\r\n"
                        + "  _m3pl.addListener(new Player.Listener() {\r\n"
                        + "    @Override public void onPlayerError(PlaybackException _e) { _idx[0]++; _try.run(); }\r\n"
                        + "  });\r\n"
                        + "  _try.run();\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview play IPTV channel %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvSetAutoReconnect");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  PlayerView _m3pv = %1$s;\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st == null) { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  _m3st.put(\"reconnect\", %2$s);\r\n"
                        + "  ExoPlayer _m3pl = (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null && %2$s) {\r\n"
                        + "    final ExoPlayer _fpl = _m3pl;\r\n"
                        + "    _m3pl.addListener(new Player.Listener() {\r\n"
                        + "      @Override public void onPlayerError(PlaybackException _e) {\r\n"
                        + "        _fpl.seekToDefaultPosition(); _fpl.prepare(); _fpl.play();\r\n"
                        + "      }\r\n"
                        + "    });\r\n"
                        + "  }\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set auto-reconnect %m.varBool");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvSleepTimer");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  final PlayerView _m3pv = %1$s;\r\n"
                        + "  long _mins = (long) %2$s;\r\n"
                        + "  android.os.Handler _h = new android.os.Handler(android.os.Looper.getMainLooper());\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) _m3pv.getTag();\r\n"
                        + "  if (_m3st != null) { Runnable _old = (Runnable) _m3st.get(\"sleep\"); if (_old != null) _h.removeCallbacks(_old); }\r\n"
                        + "  else { _m3st = new java.util.HashMap(); _m3pv.setTag(_m3st); }\r\n"
                        + "  final java.util.HashMap _fst = _m3st;\r\n"
                        + "  Runnable _sleep = new Runnable() {\r\n"
                        + "    @Override public void run() {\r\n"
                        + "      ExoPlayer _p = (ExoPlayer) _fst.get(\"p\");\r\n"
                        + "      if (_p != null) _p.pause();\r\n"
                        + "    }\r\n"
                        + "  };\r\n"
                        + "  _m3st.put(\"sleep\", _sleep);\r\n"
                        + "  _h.postDelayed(_sleep, _mins * 60 * 1000);\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview set sleep timer %d minutes");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvEnterPip");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {\r\n"
                        + "    android.app.PictureInPictureParams _params = new android.app.PictureInPictureParams.Builder().build();\r\n"
                        + "    enterPictureInPictureMode(_params);\r\n"
                        + "  }\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview enter picture-in-picture");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvToggleFavorite");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  String _key = \"iptv_fav_\" + %2$s;\r\n"
                        + "  android.content.SharedPreferences _sp = getSharedPreferences(\"iptv_prefs\", MODE_PRIVATE);\r\n"
                        + "  boolean _isFav = _sp.getBoolean(_key, false);\r\n"
                        + "  _sp.edit().putBoolean(_key, !_isFav).apply();\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview toggle favorite for channel %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvIsFavorite");
        hashMap.put("type", "b");
        hashMap.put(
                "code",
                "getSharedPreferences(\"iptv_prefs\", MODE_PRIVATE).getBoolean(\"iptv_fav_\" + %s, false)");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview is channel %s favorite");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvSaveLastWatched");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "getSharedPreferences(\"iptv_prefs\", MODE_PRIVATE).edit().putString(\"iptv_last_url\", %2$s).putString(\"iptv_last_name\", %3$s).apply();");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview save last watched URL %s name %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvGetLastWatchedUrl");
        hashMap.put("type", "s");
        hashMap.put(
                "code",
                "getSharedPreferences(\"iptv_prefs\", MODE_PRIVATE).getString(\"iptv_last_url\", \"\")");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview get last watched URL");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvGetLastWatchedName");
        hashMap.put("type", "s");
        hashMap.put(
                "code",
                "getSharedPreferences(\"iptv_prefs\", MODE_PRIVATE).getString(\"iptv_last_name\", \"\")");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview get last watched name");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvSearchChannels");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.ArrayList<java.util.HashMap<String, Object>> _groups = %2$s;\r\n"
                        + "  String _query = %3$s.toLowerCase();\r\n"
                        + "  java.util.ArrayList<java.util.HashMap<String, Object>> _out = %4$s;\r\n"
                        + "  _out.clear();\r\n"
                        + "  for (java.util.HashMap<String, Object> _g : _groups) {\r\n"
                        + "    java.util.ArrayList<java.util.HashMap<String, Object>> _chs = (java.util.ArrayList<java.util.HashMap<String, Object>>) _g.get(\"channels\");\r\n"
                        + "    if (_chs == null) continue;\r\n"
                        + "    for (java.util.HashMap<String, Object> _ch : _chs) {\r\n"
                        + "      String _name = (String) _ch.get(\"name\");\r\n"
                        + "      if (_name != null && _name.toLowerCase().contains(_query)) _out.add(_ch);\r\n"
                        + "    }\r\n"
                        + "  }\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview search channels in %m.listMap for %s to %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvSelectAudioTrack");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) {\r\n"
                        + "    int _idx = (int) %2$s;\r\n"
                        + "    _m3pl.setTrackSelectionParameters(_m3pl.getTrackSelectionParameters().buildUpon().setPreferredAudioLanguage(null).build());\r\n"
                        + "    androidx.media3.common.Tracks _tracks = _m3pl.getCurrentTracks();\r\n"
                        + "    int _ai = 0;\r\n"
                        + "    for (androidx.media3.common.Tracks.Group _g : _tracks.getGroups()) {\r\n"
                        + "      if (_g.getType() == androidx.media3.common.C.TRACK_TYPE_AUDIO) {\r\n"
                        + "        for (int _i = 0; _i < _g.length; _i++) {\r\n"
                        + "          if (_ai == _idx) { _m3pl.setTrackSelectionParameters(_m3pl.getTrackSelectionParameters().buildUpon().setOverrideForType(new androidx.media3.exoplayer.trackselection.TrackSelectionOverride(_g.getMediaTrackGroup(), _i)).build()); }\r\n"
                        + "          _ai++;\r\n"
                        + "        }\r\n"
                        + "      }\r\n"
                        + "    }\r\n"
                        + "  }\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview select audio track index %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "iptvSelectSubtitleTrack");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "{\r\n"
                        + "  java.util.HashMap _m3st = (java.util.HashMap) %1$s.getTag();\r\n"
                        + "  ExoPlayer _m3pl = _m3st == null ? null : (ExoPlayer) _m3st.get(\"p\");\r\n"
                        + "  if (_m3pl != null) {\r\n"
                        + "    int _idx = (int) %2$s;\r\n"
                        + "    androidx.media3.common.Tracks _tracks = _m3pl.getCurrentTracks();\r\n"
                        + "    int _si = 0;\r\n"
                        + "    for (androidx.media3.common.Tracks.Group _g : _tracks.getGroups()) {\r\n"
                        + "      if (_g.getType() == androidx.media3.common.C.TRACK_TYPE_TEXT) {\r\n"
                        + "        for (int _i = 0; _i < _g.length; _i++) {\r\n"
                        + "          if (_si == _idx) { _m3pl.setTrackSelectionParameters(_m3pl.getTrackSelectionParameters().buildUpon().setOverrideForType(new androidx.media3.exoplayer.trackselection.TrackSelectionOverride(_g.getMediaTrackGroup(), _i)).build()); }\r\n"
                        + "          _si++;\r\n"
                        + "        }\r\n"
                        + "      }\r\n"
                        + "    }\r\n"
                        + "  }\r\n"
                        + "}");
        hashMap.put("color", "#9C27B0");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.mediaplayerview select subtitle track index %d");
        arrayList.add(hashMap);

        // ===== End IPTV Playlist blocks =====

        hashMap = new HashMap<>();
        hashMap.put("name", "launchApp");
        hashMap.put("type", " ");
        hashMap.put("code", "%s = getPackageManager().getLaunchIntentForPackage(%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.intent set app package %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "changeStatebarColour");
        hashMap.put("type", " ");
        hashMap.put(
                "code",
                "if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {\r\n"
                        + "final Window window = %s.this.getWindow();\r\n"
                        + "window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);\r\n"
                        + "window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);\r\n"
                        + "window.setStatusBarColor(%s);\r\n"
                        + "}");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.activity set statebar color %m.color");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "Dialog SetIcon");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.setIcon(R.drawable.%s);");
        hashMap.put("color", "#2CA5E2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.dialog setIcon %m.resource_bg");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "ViewPagerNotifyOnDtatChange");
        hashMap.put("type", " ");
        hashMap.put("code", "((PagerAdapter)%s.getAdapter()).notifyDataSetChanged();");
        hashMap.put("color", "#4A6CD4");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.viewpager notifyDataSetChanged");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnMap");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnListStr");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnListMap");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnView");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return %s;");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return %m.view");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "repeatKnownNum");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "for (int %2$s = 0; %2$s < (int)(%1$s); %2$s++) {\r\n%3$s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "repeat %d: %s.inputOnly ++");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "whileLoop");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "while(%s) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "while %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "tryCatch");
        hashMap.put("type", "e");
        hashMap.put("typeName", "");
        hashMap.put("code", "try {\r\n%s\r\n} catch (Exception e) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "try");
        hashMap.put("spec2", "catch");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "switchStr");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "switch(%s) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "switch %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "switchNum");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "switch((int)%s) {\r\n%s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "switch %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "caseStr");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "case %s: {\r\n%s\r\nbreak;\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "case %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "caseNum");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "case ((int)%s): {\r\n%s\r\nbreak;\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "case %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "defaultSwitch");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "default: {\r\n%s\r\nbreak;\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "default");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnString");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return (%s);");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnNumber");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return (%s);");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "returnBoolean");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "return (%s);");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "return %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "reverseList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.reverse(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "reverse %m.list");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "shuffleList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.shuffle(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "shuffle %m.list");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sortList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.sort(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "sort %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "sortListnum");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.sort(%s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "sort %m.listInt");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "swapInList");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "Collections.swap(%s, (int)(%s), (int)(%s));");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "swap %m.list position %d with %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getMapAtPosListmap");
        hashMap.put("type", "a");
        hashMap.put("typeName", "");
        hashMap.put("code", "%2$s.get((int)(%1$s))");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "get Map at %d of %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setMapAtPosListmap");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%3$s.set((int)(%2$s), %1$s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "set %m.varMap at %d of %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setAtPosListstr");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%3$s.set((int)%2$s, %1$s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "set %s at %d of %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "setAtPosListnum");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%3$s.set((int)%2$s, %1$s);");
        hashMap.put("color", "#cc5b22");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "set %d at %d of %m.listInt");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "GsonListTojsonString");
        hashMap.put("type", "s");
        hashMap.put("typeName", "");
        hashMap.put("code", "new Gson().toJson(%s)");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.list to JSON String");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "GsonStringToListString");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "%2$s = new Gson().fromJson(%1$s, new"
                        + " TypeToken<ArrayList<String>>(){}.getType());");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "JSON %s to %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "GsonStringToListNumber");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "%2$s = new Gson().fromJson(%1$s, new"
                        + " TypeToken<ArrayList<Double>>(){}.getType());");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "JSON %s to %m.listInt");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetNumber");
        hashMap.put("type", "d");
        hashMap.put("code", "(double)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap get number key %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutNumber");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, (int)(%s));");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap put key %s value int %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutNumber2");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, (double)(%s));");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap put key %s value double %d");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetBoolean");
        hashMap.put("type", "b");
        hashMap.put("code", "(boolean)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap get boolean key %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutBoolean");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap put key %s value %b");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetMap");
        hashMap.put("type", "a");
        hashMap.put("code", "(HashMap<String,Object>)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap get Map key %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutMap");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap put key %s value %m.varMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapListstr");
        hashMap.put("type", "l");
        hashMap.put("typeName", "List String");
        hashMap.put("code", "(ArrayList<String>)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap get List String key %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutListstr");
        hashMap.put("type", " ");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap put key %s value %m.listStr");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapGetListmap");
        hashMap.put("type", "l");
        hashMap.put("typeName", "List Map");
        hashMap.put("code", "(ArrayList<HashMap<String,Object>>)%s.get(%s)");
        hashMap.put("palette", "-1");
        hashMap.put("color", "#ee7d15");
        hashMap.put("spec", "%m.varMap get List Map key %s");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "hashmapPutListmap");
        hashMap.put("type", " ");
        hashMap.put("color", "#ee7d15");
        hashMap.put("code", "%s.put(%s, %s);");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.varMap put key %s value %m.listMap");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "addSourceDirectly");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "add source directly %s.inputOnly");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "asdBoolean");
        hashMap.put("type", "b");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "boolean %s.inputOnly");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "asdNumber");
        hashMap.put("type", "d");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "number %s.inputOnly");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "asdString");
        hashMap.put("type", "s");
        hashMap.put("typeName", "");
        hashMap.put("code", "%s");
        hashMap.put("color", "#5cb722");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "string %s.inputOnly");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "RepeatKnownNumDescending");
        hashMap.put("type", "c");
        hashMap.put("typeName", "");
        hashMap.put("code", "for (int %2$s = ((int) %1$s - 1); %2$s > -1; %2$s--) {\r\n%3$s\r\n}");
        hashMap.put("color", "#e1a92a");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "repeat %d: %s.inputOnly --");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdLoad");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "{\r\n"
                        + "AdRequest adRequest = new AdRequest.Builder().build();\r\n"
                        + "InterstitialAd.load(%2$s.this, _ad_unit_id, adRequest,"
                        + " _%1$s_interstitial_ad_load_callback);\r\n"
                        + "}");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.interstitialad load in %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdShow");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put(
                "code",
                "if (%1$s != null) {\r\n"
                        + "%1$s.show(%2$s.this);\r\n"
                        + "} else {\r\n"
                        + "SketchwareUtil.showMessage(getApplicationContext(), \"Error: InterstitialAd"
                        + " %1$s hasn't been loaded yet!\");\r\n"
                        + "}");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.interstitialad show ad in %m.activity");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdIsLoaded");
        hashMap.put("type", "b");
        hashMap.put("typeName", "");
        hashMap.put("code", "%1$s != null");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "%m.interstitialad is loaded");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "interstitialAdRegisterFullScreenContentCallback");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.interstitialad register fullscreen content callbacks (This Block isn't needed"
                        + " anymore, please remove it)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "rewardedAdRegisterFullScreenContentCallback");
        hashMap.put("type", " ");
        hashMap.put("typeName", "");
        hashMap.put("code", "");
        hashMap.put("color", "#2aa4e2");
        hashMap.put("palette", "-1");
        hashMap.put(
                "spec",
                "%m.videoad register fullscreen content callbacks (This Block isn't needed anymore,"
                        + " please remove it)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "getResString");
        hashMap.put("type", "s");
        hashMap.put("code", "getString(%s)");
        hashMap.put("color", "#7c83db");
        hashMap.put("palette", "-1");
        hashMap.put("spec", "get String from %m.ResString");
        arrayList.add(hashMap);
    }

    private static boolean showAll() {
        return ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_ALWAYS_SHOW_BLOCKS)
                || ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_EVERY_SINGLE_BLOCK);
    }

    private static boolean showBuiltIn() {
        return ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_BUILT_IN_BLOCKS)
                || ConfigActivity.isSettingEnabled(ConfigActivity.SETTING_SHOW_EVERY_SINGLE_BLOCK);
    }

    public static void primaryBlocksA(
            LogicEditorActivity logicEditorActivity,
            boolean isBoolUsed,
            boolean isIntUsed,
            boolean isStrUsed,
            boolean isMapUsed) {
        logicEditorActivity.a("Blocks", getTitleBgColor(logicEditorActivity));
        if (showAll() || isBoolUsed) {
            logicEditorActivity.a(" ", "setVarBoolean");
        }
        if (showAll() || isIntUsed) {
            logicEditorActivity.a(" ", "setVarInt");
            logicEditorActivity.a(" ", "increaseInt");
            logicEditorActivity.a(" ", "decreaseInt");
        }
        if (showAll() || isStrUsed) {
            logicEditorActivity.a(" ", "setVarString");
        }
        if (showAll() || isMapUsed) {
            logicEditorActivity.a(" ", "mapCreateNew");
            logicEditorActivity.a("Map put values", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a(" ", "mapPut");
        }
        if (showBuiltIn() && (showAll() || isMapUsed)) {
            logicEditorActivity.a(" ", "hashmapPutNumber");
            logicEditorActivity.a(" ", "hashmapPutNumber2");
            logicEditorActivity.a(" ", "hashmapPutBoolean");
            logicEditorActivity.a(" ", "hashmapPutMap");
            logicEditorActivity.a(" ", "hashmapPutListstr");
            logicEditorActivity.a(" ", "hashmapPutListmap");
        }
        if (showAll() || isMapUsed) {
            logicEditorActivity.a("Map get values", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("s", "mapGet");
        }
        if (showBuiltIn() && (showAll() || isMapUsed)) {
            logicEditorActivity.a("d", "hashmapGetNumber");
            logicEditorActivity.a("b", "hashmapGetBoolean");
            logicEditorActivity.a("a", "hashmapGetMap");
            logicEditorActivity.a("", "l", "List String", "hashmapListstr");
            logicEditorActivity.a("", "l", "List Map", "hashmapGetListmap");
        }
        if (showAll() || isMapUsed) {
            logicEditorActivity.a("Map general", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "mapIsEmpty");
            logicEditorActivity.a("b", "mapContainKey");
            logicEditorActivity.a("b", "mapContainValue");
            logicEditorActivity.a("d", "mapSize");
            logicEditorActivity.a(" ", "mapRemoveKey");
            logicEditorActivity.a(" ", "mapClear");
            logicEditorActivity.a(" ", "mapGetAllKeys");
        }
    }

    public static void primaryBlocksB(
            LogicEditorActivity logicEditorActivity,
            boolean isListNumUsed,
            boolean isListStrUsed,
            boolean isListMapUsed) {
        String eventName = logicEditorActivity.eventName;
        boolean inOnBindCustomViewEvent = eventName.equals("onBindCustomView");
        boolean inOnFilesPickedEvent = eventName.equals("onFilesPicked");
        if (showAll() || isListNumUsed) {
            logicEditorActivity.a("List Number", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "containListInt");
            logicEditorActivity.a("d", "getAtListInt");
            logicEditorActivity.a("d", "indexListInt");
            logicEditorActivity.a(" ", "addListInt");
            logicEditorActivity.a(" ", "insertListInt");
        }
        if (showBuiltIn() && (showAll() || isListNumUsed)) {
            logicEditorActivity.a(" ", "setAtPosListnum");
        }
        if (showBuiltIn() && (showAll() || isListNumUsed)) {
            logicEditorActivity.a(" ", "sortListnum");
        }
        if (showAll() || isListStrUsed || inOnFilesPickedEvent) {
            logicEditorActivity.a("List String", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "containListStr");
            logicEditorActivity.a("d", "indexListStr");
            logicEditorActivity.a("s", "getAtListStr");
            logicEditorActivity.a(" ", "addListStr");
            logicEditorActivity.a(" ", "insertListStr");
        }
        if (showBuiltIn() && (showAll() || isListStrUsed)) {
            logicEditorActivity.a(" ", "setAtPosListstr");
        }
        if (showAll() || isListStrUsed) {
            logicEditorActivity.a(" ", "sortList");
        }
        if (showAll() || isListMapUsed || inOnBindCustomViewEvent) {
            logicEditorActivity.a("List Map", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a("b", "containListMap");
            logicEditorActivity.a("s", "getAtListMap");
            if (showBuiltIn()) {
                logicEditorActivity.a("a", "getMapAtPosListmap");
            }
            logicEditorActivity.a(" ", "addListMap");
            logicEditorActivity.a(" ", "insertListMap");
            logicEditorActivity.a(" ", "setListMap");
            logicEditorActivity.a(" ", "setMapAtPosListmap");
        }
        if (showAll() || isListMapUsed) {
            logicEditorActivity.a(" ", "addMapToList");
            logicEditorActivity.a(" ", "insertMapToList");
            logicEditorActivity.a(" ", "getMapInList");
            logicEditorActivity.a(" ", "deleteMapFromListmap");
            logicEditorActivity.a(" ", "sortListmap");
        }
        if (showAll()
                || isListMapUsed
                || isListStrUsed
                || isListNumUsed
                || inOnBindCustomViewEvent
                || inOnFilesPickedEvent) {
            logicEditorActivity.a("General", getTitleBgColor(logicEditorActivity));
            logicEditorActivity.a(" ", "listAddAll");
            logicEditorActivity.a("d", "lengthList");
            logicEditorActivity.a(" ", "deleteList");
            logicEditorActivity.a(" ", "clearList");
            logicEditorActivity.a(" ", "reverseList");
            if (showBuiltIn()) {
                logicEditorActivity.a(" ", "shuffleList");
                logicEditorActivity.a(" ", "swapInList");
            }
        }
    }

    public static void primaryBlocksC(LogicEditorActivity logicEditorActivity) {
        logicEditorActivity.a("c", "repeat");
        if (showBuiltIn()) {
            logicEditorActivity.a("c", "repeatKnownNum");
            logicEditorActivity.a("c", "RepeatKnownNumDescending");
        }
        logicEditorActivity.a("c", "forever");
        if (showBuiltIn()) {
            logicEditorActivity.a("c", "whileLoop");
        }
        logicEditorActivity.a("c", "if");
        logicEditorActivity.a("e", "ifElse");
        if (showBuiltIn()) {
            logicEditorActivity.a("b", "instanceOfOperator");
            logicEditorActivity.a("b", "isEmpty");
            logicEditorActivity.a("c", "switchStr");
            logicEditorActivity.a(" ", "caseStrAnd");
            logicEditorActivity.a("c", "caseStr");
            logicEditorActivity.a("c", "switchNum");
            logicEditorActivity.a(" ", "caseNumAnd");
            logicEditorActivity.a("c", "caseNum");
            logicEditorActivity.a("c", "defaultSwitch");
            logicEditorActivity.a("e", "tryCatch");
            logicEditorActivity.a("s", "ternaryString");
            logicEditorActivity.a("d", "ternaryNumber");
            logicEditorActivity.a("f", "returnString");
            logicEditorActivity.a("f", "returnNumber");
            logicEditorActivity.a("f", "returnBoolean");
            logicEditorActivity.a("f", "returnMap");
            logicEditorActivity.a("f", "returnListStr");
            logicEditorActivity.a("f", "returnListMap");
            logicEditorActivity.a("f", "returnView");
            logicEditorActivity.a("f", "break");
            logicEditorActivity.a("f", "continue");
        }
    }

    public static void primaryBlocksD(LogicEditorActivity logicEditorActivity) {
        logicEditorActivity.a("b", "true");
        logicEditorActivity.a("b", "false");
        logicEditorActivity.a("b", "<");
        logicEditorActivity.a("b", "=");
        logicEditorActivity.a("b", ">");
        logicEditorActivity.a("b", "&&");
        logicEditorActivity.a("b", "||");
        logicEditorActivity.a("b", "not");
        logicEditorActivity.a("d", "+");
        logicEditorActivity.a("d", "-");
        logicEditorActivity.a("d", "*");
        logicEditorActivity.a("d", "/");
        logicEditorActivity.a("d", "%");
        logicEditorActivity.a("d", "random");
        logicEditorActivity.a("d", "stringLength");
        logicEditorActivity.a("s", "stringJoin");
        logicEditorActivity.a("d", "stringIndex");
        logicEditorActivity.a("d", "stringLastIndex");
        logicEditorActivity.a("s", "stringSub");
        if (showBuiltIn()) {
            logicEditorActivity.a("s", "stringSubSingle");
        }
        logicEditorActivity.a("b", "stringEquals");
        logicEditorActivity.a("b", "stringContains");
        if (showBuiltIn()) {
            logicEditorActivity.a("b", "stringMatches");
        }
        logicEditorActivity.a("s", "stringReplace");
        if (showBuiltIn()) {
            logicEditorActivity.a("s", "stringReplaceFirst");
            logicEditorActivity.a("s", "stringReplaceAll");
            logicEditorActivity.a("s", "reverse");
            logicEditorActivity.a("s", "html");
        }
        logicEditorActivity.a("s", "trim");
        logicEditorActivity.a("s", "toUpperCase");
        logicEditorActivity.a("s", "toLowerCase");
        logicEditorActivity.a("d", "toNumber");
        logicEditorActivity.a("d", "strParseInteger");
        logicEditorActivity.a("d", "toHashCode");
        logicEditorActivity.a("s", "toString");
        logicEditorActivity.a("s", "toStringWithDecimal");
        logicEditorActivity.a("s", "toStringFormat");
        logicEditorActivity.a(" ", "strToMap");
        logicEditorActivity.a("s", "mapToStr");
        logicEditorActivity.a(" ", "strToListMap");
        logicEditorActivity.a("s", "listMapToStr");
        if (showBuiltIn()) {
            logicEditorActivity.a(" ", "GsonStringToListString");
            logicEditorActivity.a(" ", "GsonStringToListNumber");
            logicEditorActivity.a("s", "GsonListTojsonString");
            logicEditorActivity.a(" ", "stringSplitToList");
        }
        logicEditorActivity.a("add source directly", getTitleBgColor(logicEditorActivity));
        logicEditorActivity.a(" ", "addSourceDirectly");
        logicEditorActivity.a("b", "asdBoolean");
        logicEditorActivity.a("d", "asdNumber");
        logicEditorActivity.a("s", "asdString");
    }

    private static @ColorInt int getTitleBgColor(LogicEditorActivity logicEditorActivity) {
        return ThemeUtils.getColor(logicEditorActivity, ThemeUtils.isDarkThemeEnabled(logicEditorActivity) ? R.attr.colorSurfaceContainerHigh : R.attr.colorSurfaceInverse);
    }
}
