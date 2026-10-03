package dev.aldi.sayuti.editor.view.palette;

import android.content.Context;
import android.view.ViewGroup;

import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;

import mod.agus.jcoderz.beans.ViewBeans;
import pro.sketchware.R;

public class IconMedia3Player extends IconBase {

    public IconMedia3Player(Context context) {
        super(context);
        setWidgetImage(R.drawable.ic_mtrl_media3player);
        setWidgetName("Media3Player");
    }

    @Override
    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = ViewBeans.VIEW_TYPE_WIDGET_MEDIA3PLAYERVIEW;
        viewBean.layout.width = ViewGroup.LayoutParams.MATCH_PARENT;
        viewBean.layout.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        viewBean.text.text = getName();
        viewBean.convert = "androidx.media3.ui.PlayerView";
        viewBean.inject = "app:show_buffering=\"when_playing\"\napp:show_shuffle_button=\"false\"\napp:use_controller=\"true\"";
        return viewBean;
    }
}
