package com.android.alen.mybasicproject.Net;

import com.android.alen.mybasicproject.Net.Bean.BookResultBean;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Alen on 2018/2/27.
 */

public class RetroInteractorImpl implements RetroInteractor{
    private final RetroService api;

    @Inject
    public RetroInteractorImpl(RetroService myApi) {
        this.api = myApi;
    }

    @Override
    public Subscription queryBook(String keyWord, int start, int count, BaseSubsribe<BookResultBean> subsribe) {
        Observable<BookResultBean> observable = api.queryBook(keyWord, start, count);
        Subscription subscribe = observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subsribe);
        return subscribe;
    }
}
