package com.huny.baidutts.model.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 19:16
 * @description： Utools返回的数据
 */
public class UtoolsDto implements Serializable {

    /**
     * 基础信息
     * */
    private ResourceDto resource;

    /**
     * 签名
     * */
    private String sign;

    public ResourceDto getResource() {
        return resource;
    }

    public void setResource(ResourceDto resource) {
        this.resource = resource;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "UtoolsDto{" +
                "resource=" + resource +
                ", sign='" + sign + '\'' +
                '}';
    }
}
