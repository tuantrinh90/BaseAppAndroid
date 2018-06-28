package com.base.di;

import android.content.Context;

import com.bon.eventbus.IEvent;
import com.bon.eventbus.RxBus;
import com.base.application.AppContext;
import com.base.interactors.IDataModule;
import com.base.interactors.database.IDbModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {
    private final AppContext appContext;

    public AppModule(AppContext appContext) {
        this.appContext = appContext;
    }

    @Singleton
    @Provides
    public RxBus<IEvent> provideEvenBus() {
        return new RxBus<>();
    }

    @Singleton
    @Provides
    public Context provideContext() {
        return appContext.getApplicationContext();
    }

    @Singleton
    @Provides
    public IDataModule provideDataModule() {
        return new DataModule(appContext.getComponent());
    }

    @Singleton
    @Provides
    public IDbModule provideDbModule() {
        return new DbModule(appContext.getComponent());
    }
}
