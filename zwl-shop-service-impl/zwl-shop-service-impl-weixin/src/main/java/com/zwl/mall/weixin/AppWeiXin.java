package com.zwl.mall.weixin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
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
@EnableSwagger2Doc
@EnableApolloConfig
public class AppWeiXin {
    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class, args);
    }
}
