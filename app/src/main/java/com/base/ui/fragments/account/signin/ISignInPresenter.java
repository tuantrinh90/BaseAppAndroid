package com.base.ui.fragments.account.signin;

import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;



public interface ISignInPresenter<V extends MvpView> extends MvpPresenter<V> {
    boolean isValid();

    void onSignIn();
}
