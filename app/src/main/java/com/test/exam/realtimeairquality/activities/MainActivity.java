package com.test.exam.realtimeairquality.activities;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.exam.realtimeairquality.R;
import com.test.exam.realtimeairquality.fragments.MainFragmentPagerAdapter;
import com.test.exam.realtimeairquality.fragments.SensorDataFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private FragmentStatePagerAdapter mFragmentStatePagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = findViewById(R.id.main_viewpager);
        mFragmentStatePagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mFragmentStatePagerAdapter);
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
//        fragmentTransaction.add(new SensorDataFragment(), "SensorDataFragment");
//        fragmentTransaction.commit();
    }
}
