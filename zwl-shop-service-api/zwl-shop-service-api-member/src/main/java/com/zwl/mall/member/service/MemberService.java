package com.zwl.mall.member.service;

import com.zwl.mall.base.BaseResponse;
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
@Api(tags = "会员服务接口")
public interface MemberService {
    /**
     * 获取用户信息
     *
     * @return
     */
    @ApiOperation(value = "获取会员信息")
    @GetMapping("/getMemberInfo")
    BaseResponse<WxModel> getMemberInfo();
}
