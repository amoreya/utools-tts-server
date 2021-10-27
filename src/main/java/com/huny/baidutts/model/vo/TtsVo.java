package com.huny.baidutts.model.vo;

import java.io.Serializable;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 15:47
 * @description： 返回的音频地址
 */
public class TtsVo implements Serializable {

    /**
     * 返回的音频的地址
     * */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TtsVo{" +
                "url='" + url + '\'' +
                '}';
    }
}
