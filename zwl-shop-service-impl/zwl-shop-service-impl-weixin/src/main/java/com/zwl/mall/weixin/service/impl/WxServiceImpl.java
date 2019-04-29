package com.zwl.mall.weixin.service.impl;

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
public class WxServiceImpl implements WxService {
    @Override
    public WxModel getWxModel() {
        return new WxModel("123", "二师兄");
    }
}
