package com.kun.baselib.base;

import android.app.Application;
import android.content.Context;

import com.kun.baselib.dagger.AppComponent;
import com.kun.baselib.dagger.AppModule;
import com.kun.baselib.dagger.DaggerAppComponent;

/**
 * Created by ${KevinZhang} on 2018/5/29.
 */

public class BaseApplication extends Application {
    private static BaseApplication instance;
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
        instance = this;
    }

    public static BaseApplication getInstance(){
        return instance;
    }

    public static Context getContext() {
        return getInstance().getApplicationContext();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    //初始化 component
    private void initializeInjector() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
