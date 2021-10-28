package com.huny.baidutts.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/28 10:30
 * @description： 用户使用TTS功能详情
 */
public class UseInfo implements Serializable {

    /**
     * 用户姓名
     * */
    private String nickname;

    /**
     * 用户ID
     * */
    private String open_id;

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
     * 录音的URL地址
     * */
    private String  url ;

    /**
     * 语音的创建时间
     * */
    private Timestamp creatTime ;

    /**
     * 语音的创建时间
     * */
    private Timestamp deadLine ;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public Timestamp getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Timestamp deadLine) {
        this.deadLine = deadLine;
    }

    @Override
    public String toString() {
        return "UseInfo{" +
                "nickname='" + nickname + '\'' +
                ", open_id='" + open_id + '\'' +
                ", tex='" + tex + '\'' +
                ", spd='" + spd + '\'' +
                ", pit='" + pit + '\'' +
                ", vol='" + vol + '\'' +
                ", per='" + per + '\'' +
                ", url='" + url + '\'' +
                ", creatTime=" + creatTime +
                ", deadLine=" + deadLine +
                '}';
    }
}
