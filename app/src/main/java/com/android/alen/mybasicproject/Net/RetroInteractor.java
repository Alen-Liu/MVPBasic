package com.android.alen.mybasicproject.Net;

import com.android.alen.mybasicproject.Net.Bean.BookResultBean;

import rx.Subscription;

/**
 * Created by Alen on 2018/2/27.
 */

public interface RetroInteractor {
    Subscription queryBook(String keyWord, int start, int count, BaseSubsribe<BookResultBean> subsribe);

}
