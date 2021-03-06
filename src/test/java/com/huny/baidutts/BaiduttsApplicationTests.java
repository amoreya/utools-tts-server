package com.huny.baidutts;

import com.huny.baidutts.config.AppConfig;
import com.huny.baidutts.config.BaiDuTtsAuthConfig;
import com.huny.baidutts.config.BaseinfoConfig;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.service.impl.UtoolsUserServiceImpl;
import com.huny.baidutts.util.RedisUtil;
import com.huny.baidutts.util.TimeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;


@SpringBootTest
class BaiduttsApplicationTests {

    @Autowired
    private BaiDuTtsAuthConfig baiDuTtsAuthConfig;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private AppConfig appConfig;
    @Autowired
    private UtoolsUserServiceImpl utoolsService;
    @Autowired
    private BaseinfoConfig baseinfoConfig ;


    @Test
    void contextLoads() {
//        baseinfoConfig.setAccessToken("FEcyYcZ0QgIoZ1Gh5AE4ZwnbB3AhoEnP");
//        System.out.println(baseinfoConfig.toString());
//        ResourceDto resourceDto = utoolsService.getUtoolsUserInfo(baseinfoConfig);
//        System.out.println(resourceDto.toString());
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,1);//这里改为1
        Date time=cal.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String midnightString = simpleDateFormat.format(time);
        try {
            cal.setTime(simpleDateFormat.parse(midnightString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Long now = TimeUtil.getSecondTimestamp(new Date());
        Long midnight = TimeUtil.getSecondTimestamp(cal.getTime());
        if (redisUtil.get("yqh") == null){
            redisUtil.set("yqh",1);
            System.out.println("加入缓存yqh，值为："+redisUtil.get("yqh"));
        }else {
            redisUtil.incr("yqh",1);
            System.out.println("已存在yqh，值为："+redisUtil.get("yqh"));
        }
    }
}
