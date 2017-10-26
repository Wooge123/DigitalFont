package me.yukang.digitalfont;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import java.io.File;

/**
 * Created by yukang on 2017/10/26.
 */

public class DigitalText extends AppCompatTextView{

    public DigitalText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        String path = "fonts" + File.separator + "digital-7.ttf";
        AssetManager am = context.getAssets();
        Typeface tf = Typeface.createFromAsset(am, path);
        setTypeface(tf);
    }
}
