package com.huny.baidutts.service.impl;

import com.huny.baidutts.model.dto.BaseinfoDto;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.service.IutoolsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/27 18:36
 * @description：
 */
@Service
public class UtoolsServiceImpl implements IutoolsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UtoolsServiceImpl.class);

    /**
     * 获取用户的基本信息
     *
     * @param baseinfoDto
     */
    @Override
    public ResourceDto getUtoolsUserInfo(BaseinfoDto baseinfoDto) {
        return null;
    }
}
