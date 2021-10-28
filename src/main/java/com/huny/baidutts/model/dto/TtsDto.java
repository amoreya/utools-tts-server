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
     * 请求发起者的UTOOLS用户的token
     * */
    private String accessToken;


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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "TtsDto{" +
                "tex='" + tex + '\'' +
                ", spd='" + spd + '\'' +
                ", pit='" + pit + '\'' +
                ", vol='" + vol + '\'' +
                ", per='" + per + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
