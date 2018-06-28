package com.base.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.base.common.activities.AloneFragmentActivity;
import com.base.common.activities.BaseAppCompatActivity;
import com.base.ui.fragments.account.signin.SignInFragment;



public class SplashActivity extends BaseAppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Bundle bundle = new Bundle();
        bundle.putInt("user", 1);

        AloneFragmentActivity.with(this)
                .parameters(new Bundle())
                .start(SignInFragment.class);
    }
}
