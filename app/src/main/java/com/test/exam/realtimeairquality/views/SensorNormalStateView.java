package com.test.exam.realtimeairquality.views;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.test.exam.realtimeairquality.R;

public class SensorNormalStateView extends ConstraintLayout{

    private static final int SENSOR_TEMP = 0;
    private static final int SENSOR_HUMID = 1;
    private static final int SENSOR_NOISE = 2;
    private static final int SENSOR_OZONE = 3;
    private static final int SENSOR_CO2 = 4;
    private static final int SENSOR_DUST = 5;
    private View v;
    public SensorNormalStateView(Context context) {
        super(context);
    }

    public SensorNormalStateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SensorNormalStateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public  void initView(int sensorKind){
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(infService);
        v = layoutInflater.inflate(R.layout.sensor_normal_state_view,this, false);
        setBackground(getResources().getDrawable(R.drawable.rectangle_dark_gray_background));
        addView(v);

        String sensorKindName="";
        switch(sensorKind){
            case 0:
                sensorKindName = getResources().getResourceName(R.string.sensor_name_temp); //온도
                break;
            case 1:
                sensorKindName = getResources().getResourceName(R.string.sensor_name_humid);//습도
                break;
            case 2:
                sensorKindName = getResources().getResourceName(R.string.sensor_name_noise);//소음
                break;
            case 3:
                sensorKindName = getResources().getResourceName(R.string.sensor_name_ozone);//오존
                break;
            case 4:
                sensorKindName = getResources().getResourceName(R.string.sensor_name_co2);//이산화탄소
                break;
            case 5:
                sensorKindName = getResources().getResourceName(R.string.sensor_name_dust);//먼지
                break;
            default:
                sensorKindName = "";
                break;
        }
        TextView sensorTitleView = (TextView)findViewById(R.id.sensorKindText);
        sensorTitleView.setText(sensorKindName);

    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setText(){

    }


}
