package com.huny.baidutts;

import com.huny.baidutts.config.AppConfig;
import com.huny.baidutts.config.BaiDuTtsAuthConfig;
import com.huny.baidutts.model.dto.BaseinfoDto;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.service.impl.UtoolsServiceImpl;
import com.huny.baidutts.util.HttpUtil;
import com.huny.baidutts.util.RedisUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class BaiduttsApplicationTests {

    @Autowired
    private BaiDuTtsAuthConfig baiDuTtsAuthConfig;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private AppConfig appConfig;
    @Autowired
    private UtoolsServiceImpl utoolsService;

    static BaseinfoDto baseinfoDto = null;


    @Test
    void contextLoads() {
        ResourceDto resourceDto = utoolsService.getUtoolsUserInfo(baseinfoDto);
        System.out.println(resourceDto.toString());
    }

    @BeforeAll
    static void before(){
        baseinfoDto = new BaseinfoDto();
        baseinfoDto.setPlugin_id("zupkd09y");
        baseinfoDto.setAccess_token("2IKmqX6Hg2Caw4KF1x2xW66MiLKbibUK");
        baseinfoDto.setSecret("UQO05su89x1c3RyWl1ziLrY5w9x12UYp");
        System.out.println(baseinfoDto.toString());
    }




}
