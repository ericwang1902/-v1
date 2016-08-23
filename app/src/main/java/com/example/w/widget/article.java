package com.example.w.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.w.test.R;

/**
 * Created by w on 2016/8/23.
 */
public class article extends LinearLayout {

    //控件
    private TextView titleTv, contentTv;
    //属性
    private String title, content;
    //布局
    LayoutParams lp;

    public article(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.article);

        try {
            title = ta.getString(R.styleable.article_titleText);
            content = ta.getString(R.styleable.article_contentText);
        } finally {
            ta.recycle();
        }

        titleTv = new TextView(context);
        contentTv = new TextView(context);

        titleTv.setText(title);
        contentTv.setText(content);

        lp = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        this.addView(titleTv, lp);
        this.addView(contentTv, lp);

    }
}
