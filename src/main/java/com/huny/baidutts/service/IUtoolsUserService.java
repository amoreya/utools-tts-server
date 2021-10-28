package com.huny.baidutts.service;

import com.huny.baidutts.config.BaseinfoConfig;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.model.dto.TtsDto;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 18:35
 * @description： utools的相关业务类
 */
public interface IUtoolsUserService {

    /**
     * 获取用户的基本信息
     * */
    ResourceDto getUtoolsUserInfo(BaseinfoConfig baseinfoConfig);

    /**
     * 检查参数获取用户的基本信息
     * */
    ResourceDto checkAndGetResponse(TtsDto param);
}
