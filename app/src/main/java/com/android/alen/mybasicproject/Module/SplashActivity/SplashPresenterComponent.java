package com.android.alen.mybasicproject.Module.SplashActivity;

import dagger.Component;


/**
 * Created by Alen on 2017/12/11.
 */
@Component(modules = {SplashPresenterModule.class})
public interface SplashPresenterComponent {
    void inject(SplashActivity mActivity);
}
