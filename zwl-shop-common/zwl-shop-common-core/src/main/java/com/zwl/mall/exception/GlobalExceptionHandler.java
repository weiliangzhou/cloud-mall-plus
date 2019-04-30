package com.zwl.mall.exception;

import com.zwl.mall.base.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ControllerAdvice + @ExceptionHandler 实现全局的 Controller 层的异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 处理所有不可知的异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    BaseResponse handleException(Exception e) {
        log.error(e.getMessage(), e);
        return new BaseResponse<>(ErrMsg.MSG_1000.getCode(), ErrMsg.MSG_1000.getMsg(), null);
    }

    /**
     * 处理所有业务异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BizException.class)
    @ResponseBody
    BaseResponse handleBusinessException(BizException e) {
        return new BaseResponse<>(e.getCode(), e.getMsg(), null);
    }


    /**
     * 处理所有接口数据验证异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    BaseResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error(e.getMessage(), e);
        return new BaseResponse<>(ErrMsg.MSG_1001.getCode(), ErrMsg.MSG_1001.getMsg(), null);
    }
}
