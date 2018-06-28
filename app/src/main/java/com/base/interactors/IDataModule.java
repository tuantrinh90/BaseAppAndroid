package com.base.interactors;

import android.os.Handler;

import java.util.List;

import java8.util.function.Consumer;


public interface IDataModule {
    Handler getHandler();

    void getUsers(Consumer<List<String>> consumer);
}
