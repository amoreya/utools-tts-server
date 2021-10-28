package com.huny.baidutts.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.huny.baidutts.common.response.ResponseUtil;
import com.huny.baidutts.config.BaseinfoConfig;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.model.dto.TtsDto;
import com.huny.baidutts.service.IUtoolsUserService;
import com.huny.baidutts.util.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 18:36
 * @description：
 */
@Service
public class UtoolsUserServiceImpl implements IUtoolsUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UtoolsUserServiceImpl.class);

    private static final String  URL = "https://open.u-tools.cn/baseinfo";

    @Autowired
    private BaseinfoConfig baseinfoConfig;


    /**
     * 获取用户的基本信息
     *
     * @param baseinfo
     *
     * @return
     */
    @Override
    public ResourceDto getUtoolsUserInfo(BaseinfoConfig baseinfo) {
        ResourceDto resourceDto = null;
        baseinfo.setTimestamp(getSecondTimestamp(new Date()));
        //构造请求参数
        StringBuffer param = new StringBuffer();
        param.append("access_token=");
        param.append(baseinfo.getAccessToken());
        param.append("&plugin_id=");
        param.append(baseinfo.getPluginId());
        param.append("&timestamp=");
        param.append(baseinfo.getTimestamp());
        String sign = HMACSHA256(param.toString(), baseinfo.getSecret());
        param.append("&sign=");
        param.append(sign);
        try {
            String responseJson = HttpUtil.sendGet(URL,param.toString());
            JSONObject jsonObject = JSONObject.parseObject(responseJson);
            String resourceJson = jsonObject.getString("resource");
            resourceDto = JSONObject.parseObject(resourceJson,ResourceDto.class);
        } catch (Exception e) {
            LOGGER.error("解析结果错误！"+e.getMessage());
        }
        return resourceDto;
    }

    /**
     * 检查参数获取用户的基本信息
     *
     * @param param
     *
     * @return
     */
    @Override
    public ResourceDto checkAndGetResponse(TtsDto param){
        if ("".equals(param.getAccessToken())||param.getAccessToken() == null){
            return null;
        }
        BaseinfoConfig myBaseinfoConfig = new BaseinfoConfig();
        myBaseinfoConfig.setAccessToken(param.getAccessToken());
        myBaseinfoConfig.setPluginId(baseinfoConfig.getPluginId());
        myBaseinfoConfig.setSecret(baseinfoConfig.getSecret());
        return getUtoolsUserInfo(myBaseinfoConfig);
    }

    /**
     * 获取精确到秒的时间戳
     *
     * @param date
     *
     * @return
     *
     */
    public static String getSecondTimestamp(Date date){
        if (null == date) {
            return "";
        }
        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return timestamp.substring(0,length-3);
        } else {
            return "";
        }
    }

    /**
     * HMACSHA256加密
     *
     * @param data
     * @param key
     *
     * @return
     *
     */
    public static String HMACSHA256(String data, String key)  {
        StringBuilder sb = null;
       try{
           Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
           SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
           sha256_HMAC.init(secret_key);
           byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
           sb = new StringBuilder();
           for (byte item : array) {
               sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
           }
       }catch (Exception e){
           LOGGER.error("错误！"+e);
       }
        return sb.toString();
    }
}
