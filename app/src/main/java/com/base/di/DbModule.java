package com.base.di;

import com.bon.eventbus.IEvent;
import com.bon.eventbus.RxBus;
import com.base.interactors.database.IDbModule;

import java.util.List;

import javax.inject.Inject;

import dagger.Module;


@Module
public class DbModule implements IDbModule {
    private static final String TAG = DbModule.class.getSimpleName();

    @Inject
    RxBus<IEvent> bus;

    public DbModule(AppComponent component) {
        component.inject(this);
    }

    @Override
    public List<String> getUsers() {
        return null;
    }

    @Override
    public void insertUsers(List<String> users) {

    }
}
