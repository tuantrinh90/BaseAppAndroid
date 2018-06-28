package com.base.ui.fragments.account.signin;

import com.hannesdorfmann.mosby3.mvp.MvpView;


public interface ISignInView extends MvpView {
    void showLoading(boolean isLoading);
}
