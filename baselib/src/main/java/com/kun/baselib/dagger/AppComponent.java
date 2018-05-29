package com.kun.baselib.dagger;


import com.kun.baselib.base.BaseApplication;
import com.kun.baselib.base.BaseDataCache;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by ${KevinZhang} on 2018/5/29.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    Retrofit provideRetrofit();

    BaseApplication providesApplication();

    BaseDataCache provideDataCache();
}
