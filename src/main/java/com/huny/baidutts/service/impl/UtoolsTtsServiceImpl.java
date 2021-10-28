package com.huny.baidutts.service.impl;

import com.huny.baidutts.common.response.ResponseVo;
import com.huny.baidutts.config.AppConfig;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.model.dto.TtsDto;
import com.huny.baidutts.service.IUtoolsTtsService;
import com.huny.baidutts.util.RedisUtil;
import com.huny.baidutts.util.TimeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/28 11:01
 * @description：
 */
@Service
public class UtoolsTtsServiceImpl implements IUtoolsTtsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UtoolsTtsServiceImpl.class);

    @Autowired
    private AppConfig appConfig;
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public ResponseVo doTts(TtsDto param, ResourceDto resourceDto) {
        Long now = TimeUtil.getSecondTimestamp(new Date());

        LOGGER.info("将用户请求信息存入REDIS");
        return null;

    }

    @Override
    public Boolean LimitPost(ResourceDto resourceDto) {
        return null;
    }

    public Integer doRedis(ResourceDto resourceDto){
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
        return 0;
    }
}
