package com.huny.baidutts;

import com.huny.baidutts.config.AppConfig;
import com.huny.baidutts.config.BaiDuTtsAuthConfig;
import com.huny.baidutts.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaiduttsApplicationTests {

    @Autowired
    private BaiDuTtsAuthConfig baiDuTtsAuthConfig;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private AppConfig appConfig;

    @Test
    void contextLoads() {
        System.out.println(baiDuTtsAuthConfig.toString());
        redisUtil.set("baiDuTtsAuthConfig",baiDuTtsAuthConfig.toString());
        System.out.println(appConfig.getAppTotal());
    }

}
