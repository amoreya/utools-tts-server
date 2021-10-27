package com.huny.baidutts;

import com.huny.baidutts.config.AppConfig;
import com.huny.baidutts.config.BaiDuTtsAuthConfig;
import com.huny.baidutts.util.HttpUtil;
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
        HttpUtil.sendGet("https://open.u-tools.cn/baseinfo","access_token=aaaaaaa&plugin_id=ccccc&timestamp=1624329435&sign=4dbf21a9d5a0f0e3906a0180522fd6393b4e91f738d57cafddf309afc6c547bb");
    }

}
