package com.base.common.fragments;

import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;

import com.base.application.AppContext;
import com.base.di.AppComponent;


public interface IBaseFragment {
    AppContext getAppContext();

    AppComponent getAppComponent();

    int getTitleId();

    void initToolbar(@NonNull ActionBar supportActionBar);

    void showProgress(boolean show);
}
