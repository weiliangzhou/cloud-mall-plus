package com.zwl.mall.weixin.member.fegin;

import com.zwl.mall.weixin.service.WxService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 二师兄
 * @Title: MemberFegin
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/2611:13
 */
@FeignClient(name = "zwl-mall-weixin")
public interface WxServiceFeign extends WxService {
}
