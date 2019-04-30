package com.zwl.mall.exception;

/**
 * 业务异常，用于统一处理
 */
public class BizException extends RuntimeException {

    private Integer code;
    private String msg;

    public BizException(Integer code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public BizException(Integer code, String msg, Exception e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public BizException(ErrMsg err) {
        super(err.getMsg());
        this.msg = err.getMsg();
        this.code = err.getCode();
    }

    public BizException(ErrMsg err, Exception e) {
        super(err.getMsg(), e);
        this.msg = err.getMsg();
        this.code = err.getCode();
    }

    public String getMsg() {
        return msg;
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setcode(Integer code) {
        this.code = code;
    }
}
