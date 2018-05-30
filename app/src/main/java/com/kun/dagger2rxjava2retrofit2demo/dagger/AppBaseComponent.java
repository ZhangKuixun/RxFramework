package com.kun.dagger2rxjava2retrofit2demo.dagger;

import com.kun.baselib.dagger.AppComponent;
import com.kun.baselib.dagger.PerActivity;
import com.kun.dagger2rxjava2retrofit2demo.activities.main.MainActivity;

import dagger.Component;

/**
 * Created by ${KevinZhang} on 2018/5/29.
 */

@PerActivity
@Component(dependencies = AppComponent.class, modules = {AppBaseModule.class})
public interface AppBaseComponent {
    void inject(MainActivity mainActivity);
}
