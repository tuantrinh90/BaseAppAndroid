package com.base.interactors.database;

import java.util.List;

public interface IDbModule {
    List<String> getUsers();

    void insertUsers(List<String> users);
}
