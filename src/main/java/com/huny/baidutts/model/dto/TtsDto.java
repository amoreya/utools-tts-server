package com.huny.baidutts.model.dto;

import java.io.Serializable;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 15:36
 * @description： 接收入参
 */
public class TtsDto implements Serializable {

    /**
     * 合成语音的文本
     * */
    private String  tex ;

    /**
     * 合成语音的语速，取值0-9
     * */
    private String  spd ;

    /**
     * 合成语音的语调，取值0-9
     * */
    private String  pit ;

    /**
     * 合成语音的音量，取值0-9
     * */
    private String  vol ;

    /**
     * 合成语音的发音人，0为女声，1为男声，
     * 3为情感合成-度逍遥，4为情感合成-度丫丫
     * */
    private String  per ;

    /**
     * 请求发起者的IP
     * */
    private String plugin_id;

    /**
     * 请求发起者的UTOOLS的ID
     * */
    private String access_token;

    /**
     * 插件的secret
     * */
    private String secret;

    public String getTex() {
        return tex;
    }

    public void setTex(String tex) {
        this.tex = tex;
    }

    public String getSpd() {
        return spd;
    }

    public void setSpd(String spd) {
        this.spd = spd;
    }

    public String getPit() {
        return pit;
    }

    public void setPit(String pit) {
        this.pit = pit;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

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

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "TtsDto{" +
                "tex='" + tex + '\'' +
                ", spd='" + spd + '\'' +
                ", pit='" + pit + '\'' +
                ", vol='" + vol + '\'' +
                ", per='" + per + '\'' +
                ", plugin_id='" + plugin_id + '\'' +
                ", access_token='" + access_token + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
