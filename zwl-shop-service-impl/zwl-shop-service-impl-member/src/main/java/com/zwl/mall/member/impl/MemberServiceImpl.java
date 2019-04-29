package com.zwl.mall.member.impl;

import com.zwl.mall.member.fegin.WxServiceFeign;
import com.zwl.mall.member.service.MemberService;
import com.zwl.mall.weixin.entity.WxModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 二师兄
 * @Title: MemberServiceImpl
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/2611:18
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Autowired
    private WxServiceFeign wxServiceFeign;

    @Override
    public WxModel getMemberInfo() {
        return wxServiceFeign.getWxModel();
    }
}
