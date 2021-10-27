package com.huny.baidutts.model.dto;

import java.io.Serializable;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 19:26
 * @description： 请求UTOOLS的参数实体类
 */
public class BaseinfoDto implements Serializable {

    /**
     * 插件ID
     * */
    private String plugin_id;

    /**
     * uTools 用户的 access_token
     * */
    private String access_token;

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

    public String getPlugin_id() {
        return plugin_id;
    }

    public void setPlugin_id(String plugin_id) {
        this.plugin_id = plugin_id;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
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
                "plugin_id='" + plugin_id + '\'' +
                ", access_token='" + access_token + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", sign='" + sign + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
