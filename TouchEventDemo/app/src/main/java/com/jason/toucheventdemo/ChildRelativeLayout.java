package com.jason.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Jason on 15/4/14.
 */
public class ChildRelativeLayout extends RelativeLayout {

    private static final String TAG = ChildRelativeLayout.class.getSimpleName();

    public ChildRelativeLayout(Context context) {
        super(context);
    }

    public ChildRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ChildRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "ChildRelativeLayout | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
//        return super.dispatchTouchEvent(ev);
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "ChildRelativeLayout | onInterceptTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "ChildRelativeLayout | onTouchEvent --> " + TouchEventUtil.getTouchAction(event.getAction()));
        return super.onTouchEvent(event);
    }
}
