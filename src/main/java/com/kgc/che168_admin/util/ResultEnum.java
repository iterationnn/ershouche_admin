package com.kgc.che168_admin.util;

public enum ResultEnum {
    //这里是可以自己定义的，方便与前端交互即可
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(10000,"成功"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXISTS(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空"),
    LOGIN_ERRO(4,"用户名或密码错误"),
    identyCode_ERRO(5,"验证码错误"),
    identyCode_OUTDATE(6,"验证码已超时"),
    identyCode_NOT_SEND(7,"请点击发送验证码"),
    PHONE_IS_EXISTS(8,"手机号已存在,无需重复注册"),
    DB_ERRO(9,"数据库错误"),
    REDIS_SAVE_ERRO(10,"redis存入数据错误!"),
    SAVE_ERRO(11,"存入数据错误!")
    ;
    private Integer code;
    private String msg;
 
    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
 
    public Integer getCode() {
        return code;
    }
 
    public String getMsg() {
        return msg;
    }
}

