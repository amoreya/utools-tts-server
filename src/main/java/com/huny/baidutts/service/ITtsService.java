package com.huny.baidutts.service;

import com.huny.baidutts.common.response.ResponseVo;
import com.huny.baidutts.model.dto.TtsDto;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/28 9:01
 * @description： baiduTTS封装
 */
public interface ITtsService {

    /**
     * 文本合成语音
     * */
     ResponseVo< byte[] > getTts(TtsDto param);
}
