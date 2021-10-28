package com.huny.baidutts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 19:26
 * @description： 请求UTOOLS的参数实体类
 */
@ConfigurationProperties("utools")
@Configuration
@Component
public class BaseinfoConfig implements Serializable {

    /**
     * 插件ID
     * */
    private String pluginId;

    /**
     * uTools 用户的 access_token
     * */
    private String accessToken;

    /**
     * 时间戳（秒），误差需小于 10 分钟
     * */
    private String timestamp;

    /**
     * 签名
     * */
    private String sign;

    /**
     * 插件的secret
     * */
    private String secret;

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "BaseinfoDto{" +
                "pluginId='" + pluginId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", sign='" + sign + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
