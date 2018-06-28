package com.base.common.presenters;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.bon.eventbus.IEvent;
import com.bon.eventbus.RxBus;
import com.bon.interfaces.Optional;
import com.base.di.AppComponent;
import com.base.interactors.IDataModule;
import com.base.interactors.database.IDbModule;
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import javax.inject.Inject;

import rx.subscriptions.CompositeSubscription;


public abstract class BaseDataPresenter<V extends MvpView> extends MvpBasePresenter<V>
        implements IBasePresenter {

    @Inject
    public IDataModule dataModule;
    @Inject
    public IDbModule dbModule;
    @Inject
    public RxBus<IEvent> bus;

    // rx java
    protected CompositeSubscription mSubscriptions = new CompositeSubscription();

    /**
     * @param appComponent
     */
    protected BaseDataPresenter(AppComponent appComponent) {
        // leave casting to match generic type for Dagger2
        appComponent.inject((BaseDataPresenter<MvpView>) this);
    }

    /**
     * Wrap view getter to optional value.
     *
     * @return {@link Optional} of view.
     */
    @NonNull
    protected Optional<V> getOptView() {
        return new Optional<>(getView());
    }

    @Override
    public void processArguments(Bundle arguments) {

    }

    @Override
    public void saveInstanceState(Bundle bundle) {

    }

    @Override
    public void restoreInstanceState(Bundle bundle) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        // un-subscribe event bus
        bus.unSubscribe(this);

        // un-subscribe rx java
        if (!mSubscriptions.isUnsubscribed()) {
            mSubscriptions.unsubscribe();
        }
    }
}
