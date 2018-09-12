package com.test.exam.realtimeairquality.data.sensor;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;

import com.test.exam.realtimeairquality.R;

public class SensorType {
    public static final int SENSOR_TEMP = 0;
    public static final int SENSOR_HUMID = 1;
    public static final int SENSOR_NOISE = 2;
    public static final int SENSOR_OZONE = 3;
    public static final int SENSOR_CO2 = 4;
    public static final int SENSOR_DUST = 5;
    private Context mContext;
    private Resources mResources;
    public SensorType(Context context) {
        mContext = context;
    }
    public SensorType(Resources resources) {
        mResources = resources;
    }
    public String getSensorName(int sensorKind){
        String sensorKindName="";
        switch(sensorKind){
            case 0:
                sensorKindName = mContext.getString(R.string.sensor_name_temp); //온도
                break;
            case 1:
                sensorKindName = mContext.getString(R.string.sensor_name_humid);//습도
                break;
            case 2:
                sensorKindName = mContext.getString(R.string.sensor_name_noise);//소음
                break;
            case 3:
                sensorKindName = mContext.getString(R.string.sensor_name_ozone);//오존
                break;
            case 4:
                sensorKindName = mContext.getString(R.string.sensor_name_co2);//이산화탄소
                break;
            case 5:
                sensorKindName = mContext.getString(R.string.sensor_name_dust);//먼지
                break;
            default:
                sensorKindName = "";
                break;
        }
        return sensorKindName;
    }
}
