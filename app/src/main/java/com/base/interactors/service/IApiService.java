package com.base.interactors.service;

import java.util.List;

import rx.Observer;

public interface IApiService {

    Observer<List<String>> getUsers();
}
