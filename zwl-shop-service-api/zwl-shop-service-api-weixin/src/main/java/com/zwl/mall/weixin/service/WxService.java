package com.zwl.mall.weixin.service;

import com.zwl.mall.common.core.base.BaseResponse;
import com.zwl.mall.weixin.entity.WxModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 二师兄
 * @Title: 微信接口
 * @Description: TODO
 * @date 2019/4/269:48
 */
@Api(tags = "微信服务接口")
public interface WxService {
    /**
     * 获取微信信息
     *
     * @return
     */
    @ApiOperation(value = "获取微信用户信息")
    @GetMapping("/getWxModel")
    BaseResponse<WxModel> getWxModel();
}
