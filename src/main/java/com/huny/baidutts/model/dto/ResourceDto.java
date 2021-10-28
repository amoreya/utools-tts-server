package com.huny.baidutts.model.dto;

import java.io.Serializable;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 19:18
 * @description： utools返回的数据的resource对应实体类
 */
public class ResourceDto implements Serializable {

    /**
     * 头像
     * */
    private String avatar;

    /**
     * 是否会员
     * */
    private Integer member;

    /**
     * 用户姓名
     * */
    private String nickname;

    /**
     * 用户ID
     * */
    private String openId;


    /**
     * 时间戳
     * */
    private Integer timestamp;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ResourceDto{" +
                "avatar='" + avatar + '\'' +
                ", member=" + member +
                ", nickname='" + nickname + '\'' +
                ", openId='" + openId + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
