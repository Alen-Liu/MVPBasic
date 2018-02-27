package com.android.alen.mybasicproject.Module.SplashActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.android.alen.mybasicproject.App;
import com.android.alen.mybasicproject.MyBaseActivity;
import com.android.alen.mybasicproject.Net.AppComponent;
import com.android.alen.mybasicproject.Net.BaseSubsribe;
import com.android.alen.mybasicproject.Net.Bean.BookResultBean;
import com.android.alen.mybasicproject.Net.RetroInteractor;

import javax.inject.Inject;

import rx.Subscription;

/**
 * Created by Alen on 2018/2/9.
 *
 * 闪屏页面，  比较复杂的App初始化逻辑 最好在这个页面进行处理。
 */

public class SplashActivity extends MyBaseActivity implements SplashContract.View{
    @Inject
    SplashPresenter mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.initView();
    }

    // 初始化页面信息
    private void initView() {
        DaggerSplashPresenterComponent.builder()
                .splashPresenterModule(new SplashPresenterModule(this)).build().inject(this);

        //getBookList();// 这里只是个示例，应该在Presenter中调用数据请求逻辑
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public Activity getActivity() {
        return this;
    }


    // 网络请求示例
    private void getBookList(){
        //通过App拿到RetroInteractor
        RetroInteractor interactor = App.getInteractor();
        Subscription subscription = interactor.queryBook("金瓶梅", 0, 1, new BaseSubsribe<BookResultBean>() {
            @Override
            public void onSuccess(BookResultBean result) {
                Toast.makeText(SplashActivity.this,"获取数据成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }
        });
    }
}
