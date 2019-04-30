package com.zwl.mall.zuul;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigChangeListener;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author 二师兄
 * @Title: MyCommandLineRunner
 * @ProjectName zwlshopparent
 * @Description: TODO
 * @date 2019/4/3016:03
 */
@Component
@Slf4j
public class MyCommandLineRunner implements CommandLineRunner {
    @ApolloConfig
    private Config config;

    @Override
    public void run(String... args) throws Exception {
        config.addChangeListener(new ConfigChangeListener() {

            @Override
            public void onChange(ConfigChangeEvent changeEvent) {
                log.debug("####分布式配置中心监听#####" + changeEvent.changedKeys().toString());
            }
        });
    }

}
