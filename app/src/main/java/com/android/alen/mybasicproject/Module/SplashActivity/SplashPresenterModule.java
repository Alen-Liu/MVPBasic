package com.android.alen.mybasicproject.Module.SplashActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alen on 2017/12/11.
 */
@Module
public class SplashPresenterModule {
    private final SplashContract.View mView;

    public SplashPresenterModule(SplashContract.View mView) {
        this.mView = mView;
    }

    @Provides
    SplashContract.View providesSplashContractView(){
        return mView;
    }
}
