package com.gupaoedu.mall.util;

import java.io.Serializable;

/*****
 * @Author: 波波
 * @Description: 咕泡云商城
 ****/
public class RespResult<T> implements Serializable {

    //响应数据结果集
    private T data;

    /**
     * 状态码
     * 20000 操作成功
     * 50000 操作失败
     */
    private long code;

    /***S
     * 响应信息
     */
    private String message;

    public RespResult() {
    }

    public RespResult(RespCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public RespResult(T data, RespCode resultCode) {
        this.data = data;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
    public static RespResult ok() {
        return new RespResult(null, RespCode.SUCCESS);
    }

    public static RespResult ok(Object data) {
        return new RespResult(data, RespCode.SUCCESS);
    }

    public static RespResult error() {
        return new RespResult(null, RespCode.ERROR);
    }

    public static RespResult error(String message) {
        return secByError(RespCode.ERROR.getCode(),message);
    }

    //自定义异常
    public static RespResult secByError(long code,String message) {
        RespResult err = new RespResult();
        err.setCode(code);
        err.setMessage(message);
        return err;
    }

    public static RespResult error(RespCode resultCode) {
        return new RespResult(resultCode);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
