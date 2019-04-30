package com.zwl.mall.weixin.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 二师兄
 * @Title: mall.AppWeixin
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/2610:45
 */
@SpringBootApplication
@EnableEurekaClient
public class ApiWeiXin {
    public static void main(String[] args) {
        SpringApplication.run(ApiWeiXin.class, args);
    }
}
