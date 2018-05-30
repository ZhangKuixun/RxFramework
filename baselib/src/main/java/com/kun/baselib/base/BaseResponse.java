package com.kun.baselib.base;


import com.google.gson.annotations.Expose;

/**
 * Created by ${KevinZhang} on 2018/5/29.
 */
public class BaseResponse<T> {

    @Expose//Expose区分实体中不想被序列化的属性，其自身包含两个属性deserialize(反序列化)和serialize（序列化），默认都为true。
    private String message;
    @Expose
    private int status;
    @Expose
    private T data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
