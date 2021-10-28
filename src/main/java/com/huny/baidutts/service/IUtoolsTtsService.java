package com.huny.baidutts.service;

import com.huny.baidutts.common.response.ResponseVo;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.model.dto.TtsDto;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/28 11:00
 * @description：
 */
public interface IUtoolsTtsService {

    ResponseVo doTts(TtsDto param, ResourceDto resourceDto);

    Boolean LimitPost(ResourceDto resourceDto);
}
