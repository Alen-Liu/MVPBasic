package com.android.alen.mybasicproject.Net;

import com.android.alen.mybasicproject.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Alen on 2018/2/27.
 * 声明AppComponent组件
 */

@Singleton
@Component(modules = {InteractorModule.class,})
public interface AppComponent {
    void inject(App app);

    RetroInteractor getRetroInteractor();
}
