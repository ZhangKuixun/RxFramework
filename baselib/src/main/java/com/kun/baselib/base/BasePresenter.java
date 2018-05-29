package com.kun.baselib.base;

/**
 * Created by ${KevinZhang} on 2018/5/29.
 */

public class BasePresenter<V extends BaseActivityView> {
    protected V mView;

    public void attachView(V mView) {
        this.mView = mView;
    }

    public void destroyView() {
        mView = null;
    }
}
