package com.zwl.mall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 二师兄
 * @Title: App
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/2518:24
 */
@SpringBootApplication
@EnableEurekaServer
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }
}
