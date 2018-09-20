package com.test.exam.realtimeairquality.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.exam.realtimeairquality.R;
import com.test.exam.realtimeairquality.data.sensor.SensorType;

public class SensorDataFragment extends Fragment {
    private int mPageNumber = 0;
    private SensorType sensorType;
    public SensorDataFragment() {
    }
    public static SensorDataFragment create(int pageNumber){
        SensorDataFragment fragment = new SensorDataFragment();
        Bundle args = new Bundle();
        args.putInt("page",pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        sensorType = new SensorType(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt("page");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment__main, container, false);
        TextView mSensorTitleTextView = v.findViewById(R.id.main_sensor_data_fragment_textview_sensor_title);
        mSensorTitleTextView.setText(sensorType.getSensorName(mPageNumber));
        TextView mSensorValueTextView = v.findViewById(R.id.main_sensor_data_fragment_textview_sensor_value);
        TextView mSensorValueUnitTextView = v.findViewById(R.id.main_sensor_data_fragment_textview_sensor_unit);
        TextView mSensorValueStateTextView = v.findViewById(R.id.main_sensor_data_fragment_textview_value_state);
        //The TextView property maxLines must be set to 1 for the text size auto-scaling feature to work.
        final int autoSizeMinTitleTextSize = 12;//min text size unit is sp
        final int autoSizeMaxTitleTextSize = 140;//max text size unit is sp
        final int autoSizeStepTitleGranularity = 1;//scaling gap

        final int autoSizeMinValueTextSize = 11;//min text size unit is sp
        final int autoSizeMaxValueTextSize = 120;//max text size unit is sp
        final int autoSizeStepValueGranularity = 1;//scaling gap

        final int autoSizeMinUnitTextSize = 10;//min text size unit is sp
        final int autoSizeMaxUnitTextSize = 105;//max text size unit is sp
        final int autoSizeStepUnitGranularity = 1;//scaling gap

        final int autoSizeMinValueStateTextSize = 14;//min text size unit is sp
        final int autoSizeMaxValueStateTextSize = 150;//max text size unit is sp
        final int autoSizeStepValueStateGranularity = 1;//scaling gap

        TextViewCompat.setAutoSizeTextTypeWithDefaults(mSensorTitleTextView, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);//Title TextView autoSizeText attribute set to Uniform
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(mSensorTitleTextView, autoSizeMinTitleTextSize, autoSizeMaxTitleTextSize,autoSizeStepTitleGranularity, TypedValue.COMPLEX_UNIT_SP);//Title TextView TextSize min, max set

        TextViewCompat.setAutoSizeTextTypeWithDefaults(mSensorValueTextView, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);//Sensor Value TextView autoSizeText attribute set to Uniform
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(mSensorValueTextView, autoSizeMinValueTextSize, autoSizeMaxValueTextSize,autoSizeStepValueGranularity, TypedValue.COMPLEX_UNIT_SP);//Sensor Value TextView TextSize min, max set

        TextViewCompat.setAutoSizeTextTypeWithDefaults(mSensorValueUnitTextView, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);//Sensor Value Unit TextView autoSizeText attribute set to Uniform
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(mSensorValueUnitTextView, autoSizeMinUnitTextSize, autoSizeMaxUnitTextSize,autoSizeStepUnitGranularity, TypedValue.COMPLEX_UNIT_SP);//Sensor Value Unit TextView TextSize min, max set

        TextViewCompat.setAutoSizeTextTypeWithDefaults(mSensorValueStateTextView, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);//Sensor Value State TextView autoSizeText attribute set to Uniform
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(mSensorValueStateTextView, autoSizeMinValueStateTextSize, autoSizeMaxValueStateTextSize,autoSizeStepValueStateGranularity, TypedValue.COMPLEX_UNIT_SP);//Sensor Value State TextView TextSize min, max set
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
