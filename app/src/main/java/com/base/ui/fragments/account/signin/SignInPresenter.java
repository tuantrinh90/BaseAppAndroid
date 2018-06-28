package com.base.ui.fragments.account.signin;


import com.base.common.presenters.BaseDataPresenter;
import com.base.di.AppComponent;
import com.base.events.SignInEvent;



public class SignInPresenter<V extends ISignInView> extends BaseDataPresenter<V> implements ISignInPresenter<V> {
    /**
     * @param appComponent
     */
    protected SignInPresenter(AppComponent appComponent) {
        super(appComponent);
        bus.subscribe(this, SignInEvent.class, signInEvent -> {

        });

        getOptView().doIfPresent(v -> v.showLoading(true));
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void onSignIn() {
        getOptView().doIfPresent(v -> v.showLoading(true));
    }
}
