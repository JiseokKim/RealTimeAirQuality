package com.test.exam.realtimeairquality.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class SensorDataFragmentManager extends FragmentManager {
    @NonNull
    @Override
    public FragmentTransaction beginTransaction() {
        return null;
    }

    @Override
    public boolean executePendingTransactions() {
        return false;
    }

    @Nullable
    @Override
    public Fragment findFragmentById(int i) {
        return null;
    }

    @Nullable
    @Override
    public Fragment findFragmentByTag(@Nullable String s) {
        return null;
    }

    @Override
    public void popBackStack() {

    }

    @Override
    public boolean popBackStackImmediate() {
        return false;
    }

    @Override
    public void popBackStack(@Nullable String s, int i) {

    }

    @Override
    public boolean popBackStackImmediate(@Nullable String s, int i) {
        return false;
    }

    @Override
    public void popBackStack(int i, int i1) {

    }

    @Override
    public boolean popBackStackImmediate(int i, int i1) {
        return false;
    }

    @Override
    public int getBackStackEntryCount() {
        return 0;
    }

    @NonNull
    @Override
    public BackStackEntry getBackStackEntryAt(int i) {
        return null;
    }

    @Override
    public void addOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {

    }

    @Override
    public void removeOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {

    }

    @Override
    public void putFragment(@NonNull Bundle bundle, @NonNull String s, @NonNull Fragment fragment) {

    }

    @Nullable
    @Override
    public Fragment getFragment(@NonNull Bundle bundle, @NonNull String s) {
        return null;
    }

    @NonNull
    @Override
    public List<Fragment> getFragments() {
        return null;
    }

    @Nullable
    @Override
    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        return null;
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }

    @Override
    public void registerFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean b) {

    }

    @Override
    public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {

    }

    @Nullable
    @Override
    public Fragment getPrimaryNavigationFragment() {
        return null;
    }

    @Override
    public void dump(String s, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strings) {

    }

    @Override
    public boolean isStateSaved() {
        return false;
    }
}
