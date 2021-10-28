package com.huny.baidutts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 15:57
 * @description： 百度语音合成的鉴权配置
 */
@ConfigurationProperties("baidu")
@Configuration
@Component
public class BaiDuTtsAuthConfig implements Serializable {

    private   String appId;
    private  String apiKey;
    private  String secretKey;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public String toString() {
        return "BaiDuTtsAuthConfig{" +
                "appId='" + appId + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", secretKey='" + secretKey + '\'' +
                '}';
    }
}
