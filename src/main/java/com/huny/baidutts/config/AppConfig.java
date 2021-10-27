package com.huny.baidutts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 17:11
 * @description： 系统调用设置
 */
@ConfigurationProperties("tts")
@Configuration
@Component
public class AppConfig implements Serializable {

    private Integer appTotal;
    private Integer userTotal;

    public Integer getAppTotal() {
        return appTotal;
    }

    public void setAppTotal(Integer appTotal) {
        this.appTotal = appTotal;
    }

    public Integer getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(Integer userTotal) {
        this.userTotal = userTotal;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "appTotal=" + appTotal +
                ", userTotal=" + userTotal +
                '}';
    }
}
