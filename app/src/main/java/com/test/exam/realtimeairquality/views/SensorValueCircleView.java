package com.test.exam.realtimeairquality.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import com.test.exam.realtimeairquality.R;

/**
 * TODO: document your custom view class.
 */
public class SensorValueCircleView extends View {
    private String mValueString; // sensor value string
    private String mUnitString;// sensor value unit string
    private int mCircleColor = Color.RED; // TODO: use a default from R.color...
    private int mValueTextColor = Color.WHITE;// sensor value text color
    private  int mUnitTextColor= Color.WHITE; // sensor value unit text color
    private float mViewDimension = 0; // TODO: use a default from R.dimen...
    private float mValueTextSize = 12; //sensor value text size
    private float mUnitTextSize = 5; //sensor value unit text size
    private Drawable mViewDrawable;

    private TextPaint mTextPaint;
    private float mTextWidth;
    private float mTextHeight;

    public SensorValueCircleView(Context context) {
        super(context);
        init(null, 0);
    }

    public SensorValueCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public SensorValueCircleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        // Load attributes
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.SensorValueCircleView, defStyle, 0);

        mValueString = a.getString(
                R.styleable.SensorValueCircleView_valueString);
        mCircleColor = a.getColor(
                R.styleable.SensorValueCircleView_circleColor,
                mCircleColor);
        mValueTextColor = a.getColor(
                R.styleable.SensorValueCircleView_valueTextColor,
                mValueTextColor);
        mUnitTextColor = a.getColor(
                R.styleable.SensorValueCircleView_unitTextColor,
                mUnitTextColor);
        // Use getDimensionPixelSize or getDimensionPixelOffset when dealing with
        // values that should fall on pixel boundaries.
        mViewDimension = a.getDimension(
                R.styleable.SensorValueCircleView_viewDimension,
                mViewDimension);
        mValueTextSize = a.getFloat(
                R.styleable.SensorValueCircleView_valueTextSize,
                mValueTextSize);
        mUnitTextSize = a.getFloat(
                R.styleable.SensorValueCircleView_unitTextSize,
                mUnitTextSize);
        if (a.hasValue(R.styleable.SensorValueCircleView_viewDrawable)) {
            mViewDrawable = a.getDrawable(
                    R.styleable.SensorValueCircleView_viewDrawable);
            mViewDrawable.setCallback(this);
        }

        a.recycle();

        // Set up a default TextPaint object
        mTextPaint = new TextPaint();
        mTextPaint.setFlags(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setTextAlign(Paint.Align.LEFT);

        // Update TextPaint and text measurements from attributes
        invalidateTextPaintAndMeasurements();
    }

    private void invalidateTextPaintAndMeasurements() {
        mTextPaint.setTextSize(mValueTextSize);
        mTextPaint.setColor(mValueTextColor);
        mTextWidth = mTextPaint.measureText(mValueString);

        Paint.FontMetrics fontMetrics = mTextPaint.getFontMetrics();
        mTextHeight = fontMetrics.bottom;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // TODO: consider storing these as member variables to reduce
        // allocations per draw cycle.
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();

        int contentWidth = getWidth() - paddingLeft - paddingRight;
        int contentHeight = getHeight() - paddingTop - paddingBottom;

        // Draw the text.
        canvas.drawText(mValueString,
                paddingLeft + (contentWidth - mTextWidth) / 2,
                paddingTop + (contentHeight + mTextHeight) / 2,
                mTextPaint);

        // Draw the example drawable on top of the text.
        if (mViewDrawable != null) {
            mViewDrawable.setBounds(paddingLeft, paddingTop,
                    paddingLeft + contentWidth, paddingTop + contentHeight);
            mViewDrawable.draw(canvas);
        }
    }

    /**
     * Gets the sensor value string attribute value.
     *
     * @return The sensor value string attribute value.
     */
    public String getValueString() {
        return mValueString;
    }

    /**
     * Sets the view's sensor value string attribute value. In the view, this string
     * is the text to draw.
     *
     * @param valueString The example string attribute value to use.
     */
    public void setValueString(String valueString) {
        mValueString = valueString;
        invalidateTextPaintAndMeasurements();
    }

    /**
     * Gets the sensor value unit string attribute value.
     *
     * @return The sensor value string attribute value.
     */
    public String getUnitString() {
        return mUnitString;
    }

    /**
     * Sets the view's snesor value unit string attribute value. In the view, this string
     * is the text to draw.
     *
     * @param unitString The example string attribute value to use.
     */
    public void setUnitString(String unitString) {
        mUnitString = unitString;
        invalidateTextPaintAndMeasurements();
    }


    /**
     * Gets the example color attribute value.
     *
     * @return The example color attribute value.
     */
    public int getCircleColor() {
        return mCircleColor;
    }

    /**
     * Sets the view's example color attribute value. In the example view, this color
     * is the font color.
     *
     * @param circleColor The example color attribute value to use.
     */
    public void setCircleColor(int circleColor) {
        mCircleColor = circleColor;
        invalidateTextPaintAndMeasurements();
    }

    /**
     * Gets the example dimension attribute value.
     *
     * @return The example dimension attribute value.
     */
    public float getViewDimension() {
        return mViewDimension;
    }

    /**
     * Sets the view's example dimension attribute value. In the example view, this dimension
     * is the font size.
     *
     * @param viewDimension The example dimension attribute value to use.
     */
    public void setViewDimension(float viewDimension) {
        mViewDimension = viewDimension;
        invalidateTextPaintAndMeasurements();
    }

    /**
     * Gets the example drawable attribute value.
     *
     * @return The example drawable attribute value.
     */
    public Drawable getViewDrawable() {
        return mViewDrawable;
    }

    /**
     * Sets the view's example drawable attribute value. In the example view, this drawable is
     * drawn above the text.
     *
     * @param viewDrawable The example drawable attribute value to use.
     */
    public void setViewDrawable(Drawable viewDrawable) {
        mViewDrawable = viewDrawable;
    }
}
