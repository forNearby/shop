package com.gupaoedu.mall.util;

/*****
 * @Author: 波波
 * @Description: 咕泡云商城
 ****/
public enum RespCode {
    SUCCESS(20000, "操作成功"),
    ERROR(50000, "操作失败"),
    SYSTEM_ERROR(50001, "系统错误");

    private long code;
    private String message;

    RespCode(long code, String message) {
        this.code = code;
        this.message = message;
    }
    RespCode() {
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
