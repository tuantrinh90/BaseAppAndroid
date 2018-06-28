package com.base.di;

import com.base.application.AppContext;
import com.base.common.activities.BaseAppCompatActivity;
import com.base.common.fragments.BaseMvpFragment;
import com.base.common.presenters.BaseDataPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import javax.inject.Singleton;

import dagger.Component;



@Singleton
@Component(modules = {
        ApiModule.class,
        DbModule.class,
        DataModule.class,
        AppModule.class
})
public interface AppComponent {
    void inject(DataModule dataModule);

    void inject(DbModule dbModule);

    void inject(AppContext appContext);

    void inject(BaseAppCompatActivity activity);

    void inject(BaseDataPresenter<MvpView> presenter);

    void inject(BaseMvpFragment<MvpView, MvpPresenter<MvpView>> fragment);
}
