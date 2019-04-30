package com.zwl.mall.weixin.service.impl;

import com.zwl.mall.base.BaseApiService;
import com.zwl.mall.base.BaseResponse;
import com.zwl.mall.weixin.entity.WxModel;
import com.zwl.mall.weixin.service.WxService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 二师兄
 * @Title: WxServiceImpl
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/269:53
 */
@RestController
public class WxServiceImpl extends BaseApiService implements WxService {
    @Override
    public BaseResponse<WxModel> getWxModel() {
        return setResultError("系统错误!");
    }
}
