package com.base.common.presenters;

import android.os.Bundle;


public interface IBasePresenter {
    void processArguments(Bundle arguments);

    void saveInstanceState(Bundle bundle);

    void restoreInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
