package com.example.faisalkhan.customratingbarlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/**
 * <h1><font color="orange">RatingBarCustom</font></h1>
 * Custom rating bar to avoid star blooding problem in native rating bar
 *
 * @author Faisal khan
 */
public class RatingBarCustom extends android.widget.RatingBar {

    private int count;
    private final int DEFAULT_STARS=5;

    public RatingBarCustom(Context context) {
        this(context, null);
    }

    public RatingBarCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.rating_bar_custom);
        count = typedArray.getInt(R.styleable.rating_bar_custom_customNumStars,DEFAULT_STARS);
        typedArray.recycle();

    }

    public RatingBarCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.rating_bar_custom, defStyleAttr, 0);
        count = typedArray.getInt(R.styleable.rating_bar_custom_customNumStars,DEFAULT_STARS);
        typedArray.recycle();
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int width = getIndeterminateDrawable().getIntrinsicWidth() * count + getPaddingLeft() +
                getPaddingRight();
        final int height = getIndeterminateDrawable().getIntrinsicHeight() + getPaddingTop()
                + getPaddingBottom();
        setMeasuredDimension(width, height);
    }
}