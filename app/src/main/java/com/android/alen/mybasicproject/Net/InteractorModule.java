package com.android.alen.mybasicproject.Net;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Alen on 2018/2/27.
 * Module类
 * 提供需要注入的类
 */
@Module
public class InteractorModule {
    @Provides
    public Retrofit provideRestroAdapter() {
        return RetroInstance.getInstance();
    }

    @Provides
    public RetroService provideHomeApi(Retrofit restAdapter) {
        return restAdapter.create(RetroService.class);
    }

    @Provides
    public RetroInteractor provideHomeInteractor(RetroService myApi) {
        return new RetroInteractorImpl(myApi);
    }

}
