package com.huny.baidutts.service;

import com.huny.baidutts.model.dto.BaseinfoDto;
import com.huny.baidutts.model.dto.ResourceDto;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 18:35
 * @description： utools的相关业务类
 */
public interface IutoolsService {

    /**
     * 获取用户的基本信息
     * */
    ResourceDto getUtoolsUserInfo(BaseinfoDto baseinfoDto);
}
