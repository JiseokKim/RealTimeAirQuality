package com.test.exam.realtimeairquality.fragments;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MainFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 12;
    public MainFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //해당하는 page의 Fragemnet를 생성합니다.
        return SensorDataFragment.create(position);
    }
    //Returns total number of pages
    @Override
    public int getCount() {
        return NUM_PAGES;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return super.isViewFromObject(view, object);
    }
}
