package com.zwl.mall.weixin.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zwl.mall.base.BaseApiService;
import com.zwl.mall.base.BaseResponse;
import com.zwl.mall.base.Constants;
import com.zwl.mall.exception.ErrMsg;
import com.zwl.mall.utils.RedisUtil;
import com.zwl.mall.weixin.service.VerifyCodeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 二师兄
 * @Title: VerificaCodeServiceImpl
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/3017:07
 */
@RestController
public class VerifyCodeServiceImpl extends BaseApiService<JSONObject> implements VerifyCodeService {
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public BaseResponse<JSONObject> verifyWeixinCode(String phone, String weixinCode) {
        if (StringUtils.isEmpty(phone)) {
            return setResultError(ErrMsg.MSG_10000.getMsg());
        }
        if (StringUtils.isEmpty(weixinCode)) {
            return setResultError(ErrMsg.MSG_10001.getMsg());
        }
        String weixinKey = Constants.WEIXINCODE_KEY + phone;
        String code = redisUtil.getString(weixinKey);
        if (StringUtils.isEmpty(code)) {
            return setResultError(ErrMsg.MSG_10002.getMsg());
        }
        if (!code.equals(weixinCode)) {
            return setResultError(ErrMsg.MSG_10003.getMsg());
        }
        redisUtil.delKey(weixinKey);
        return setResultSuccess(ErrMsg.MSG_10004.getMsg());
    }

}
