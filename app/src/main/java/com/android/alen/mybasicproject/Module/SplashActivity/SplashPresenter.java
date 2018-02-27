package com.android.alen.mybasicproject.Module.SplashActivity;


import javax.inject.Inject;

/**
 * Created by Alen on 2017/12/11.
 */

public class SplashPresenter implements SplashContract.Presenter {
    private SplashContract.View mView;
    @Inject
    public SplashPresenter(SplashContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void detachView() {
    }
}
