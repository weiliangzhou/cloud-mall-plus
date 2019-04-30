package com.zwl.mall.exception;

/**
 * 错误信息
 */
public enum ErrMsg {

    MSG_10000(10000, "手机号码不能为空"),
    MSG_10001(10001, "注册码不能为空"),
    MSG_10002(10002, "注册码已经过期,请重新发送验证码"),
    MSG_10003(10003, "注册码不正确"),
    MSG_10004(10004, "注册码验证码正确"),
    MSG_10005(10005, "数据错误"),

    MSG_1000(1000, "系统繁忙，请稍后重试"),
    MSG_1001(1001, "参数错误");


    private Integer code;
    private String msg;

    ErrMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
