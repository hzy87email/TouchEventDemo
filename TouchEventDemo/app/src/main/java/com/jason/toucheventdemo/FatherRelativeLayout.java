package com.jason.toucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Jason on 15/4/14.
 */
public class FatherRelativeLayout extends RelativeLayout {

    private static final String TAG = FatherRelativeLayout.class.getSimpleName();
    public FatherRelativeLayout(Context context) {
        super(context);
    }

    public FatherRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FatherRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "FatherRelativeLayout | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
//        return false;
//        return true;
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "FatherRelativeLayout | onInterceptTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
//        return super.onInterceptTouchEvent(ev);
//        return true;
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "FatherRelativeLayout | onTouchEvent --> " + TouchEventUtil.getTouchAction(event.getAction()));
        return super.onTouchEvent(event);
    }

}
