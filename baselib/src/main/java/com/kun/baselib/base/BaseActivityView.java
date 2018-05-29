package com.kun.baselib.base;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;

/**
 * Created by ${KevinZhang} on 2018/5/29.
 */

public interface BaseActivityView {

    BaseActivity getActivity();

    LifecycleProvider<ActivityEvent> getLifecycleProvider();
}
