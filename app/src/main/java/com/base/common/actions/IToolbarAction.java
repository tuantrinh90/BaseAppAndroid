package com.base.common.actions;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

public interface IToolbarAction {
    void setToolbarTitle(@StringRes int titleId);

    void setToolbarTitle(@NonNull String titleId);
}
