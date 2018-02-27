package com.android.alen.mybasicproject.Net;

import com.android.alen.mybasicproject.Net.Bean.BookResultBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Alen on 2018/2/27.
 *
 * Retrofit 提供一个service接口
 */

public interface RetroService {
    /**
     * 查询书籍
     * v2/book/search?q=金瓶梅&tag=&start=0&count=1
     */
    @GET("v2/book/search")
    Observable<BookResultBean> queryBook(@Query("q") String keyWord, @Query("start") int start, @Query("count") int count);
}
