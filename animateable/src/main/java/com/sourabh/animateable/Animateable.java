package com.sourabh.animateable;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews.RemoteView;

import androidx.annotation.RequiresApi;

import com.sourabh.animateable.library.BaseViewAnimator;

@RemoteView
public class Animateable extends ViewGroup {
    BaseViewAnimator animation;
    TypedArray typedArray;
    int startDelay=10;


    public Animateable(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        typedArray= context.obtainStyledAttributes(attrs,
                R.styleable.Animateable);
        int animType=typedArray.getInt(
                R.styleable.Animateable_animation, 0);
        animation=Utils.getAnimationType(animType,this);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Animateable(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
        typedArray= context.obtainStyledAttributes(attrs,
                R.styleable.Animateable);
        int animType=typedArray.getInt(
                R.styleable.Animateable_animation, 0);
        animation=Utils.getAnimationType(animType,this);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Animateable(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        typedArray= context.obtainStyledAttributes(attrs,
                R.styleable.Animateable);
        int animType=typedArray.getInt(
                R.styleable.Animateable_animation, 0);
        animation=Utils.getAnimationType(animType,this);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int count = getChildCount();

        int maxHeight = 0;
        int maxWidth = 0;

        // Find out how big everyone wants to be
        measureChildren(widthMeasureSpec, heightMeasureSpec);

        // Find rightmost and bottom-most child
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != GONE) {
                int childRight;
                int childBottom;

                Animateable.LayoutParams lp
                        = (Animateable.LayoutParams) child.getLayoutParams();

                childRight = lp.x + child.getMeasuredWidth();
                childBottom = lp.y + child.getMeasuredHeight();

                maxWidth = Math.max(maxWidth, childRight);
                maxHeight = Math.max(maxHeight, childBottom);
            }
        }


        // Check against minimum height and width
        maxHeight = Math.max(maxHeight, getSuggestedMinimumHeight());
        maxWidth = Math.max(maxWidth, getSuggestedMinimumWidth());

        setMeasuredDimension(resolveSizeAndState(maxWidth, widthMeasureSpec, 0),
                resolveSizeAndState(maxHeight, heightMeasureSpec, 0));
    }


    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 0, 0);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t,
                            int r, int b) {
        int count = getChildCount();

        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != GONE) {

                Animateable.LayoutParams lp =
                        (Animateable.LayoutParams) child.getLayoutParams();

                int childLeft =lp.x;
                int childTop = lp.y;
                child.layout(childLeft, childTop,
                        childLeft + child.getMeasuredWidth(),
                        childTop + child.getMeasuredHeight());

            }
        }
        int duration=typedArray.getInt(R.styleable.Animateable_duration,1000);
        int repeatCount=typedArray.getInt(R.styleable.Animateable_repeatCount,-1);
        int repeatMode=typedArray.getInt(R.styleable.Animateable_repeatMode,-1);
        startDelay=typedArray.getInt(R.styleable.Animateable_startDelay,10);
        animation.setDuration(duration);
        animation.setRepeatTimes(repeatCount);
        animation.setRepeatMode(repeatMode);
        if(typedArray.getBoolean(R.styleable.Animateable_autoStart,true)){

           animation.animate();
        }


    }
    public BaseViewAnimator setAnimationType(int animType){
        animation=Utils.getAnimationType(animType,this);
        return animation;
    }

    public BaseViewAnimator getAnimator(){
        return animation;
    }

    @Override
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new Animateable.LayoutParams(getContext(), attrs);
    }

    // Override to allow type-checking of LayoutParams.
    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof Animateable.LayoutParams;
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private class LayoutParams extends ViewGroup.LayoutParams {

        public int x;

        public int y;

        LayoutParams(int width, int height, int x, int y) {
            super(width, height);
            this.x = x;
            this.y = y;
        }
        LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
        }
        LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }


    }
}