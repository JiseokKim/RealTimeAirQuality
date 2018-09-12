package com.test.exam.realtimeairquality.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
        TextView mTextView = v.findViewById(R.id.number);
        mTextView.setText(sensorType.getSensorName(mPageNumber));
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
