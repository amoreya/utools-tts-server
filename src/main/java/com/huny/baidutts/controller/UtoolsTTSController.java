package com.huny.baidutts.controller;

import com.huny.baidutts.common.response.ResponseUtil;
import com.huny.baidutts.common.response.ResponseVo;
import com.huny.baidutts.config.BaseinfoConfig;
import com.huny.baidutts.model.dto.ResourceDto;
import com.huny.baidutts.model.dto.TtsDto;
import com.huny.baidutts.service.ITtsService;
import com.huny.baidutts.service.IUtoolsTtsService;
import com.huny.baidutts.service.IUtoolsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/28 9:56
 * @description：
 */
@CrossOrigin
@RestController
@RequestMapping("tts")
public class UtoolsTTSController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UtoolsTTSController.class);

    @Autowired
    private ITtsService ttsService;
    @Autowired
    private IUtoolsUserService utoolsUserService;
    @Autowired
    private IUtoolsTtsService utoolsTtsService;


    @PostMapping("/get")
    public ResponseVo getTTs(HttpServletResponse response, @RequestBody TtsDto param){
        LOGGER.info("请求参数："+param.toString());
        ResourceDto resourceDto = utoolsUserService.checkAndGetResponse(param);
        if (resourceDto == null){
            return ResponseUtil.toFailResponseVo("未授权！请使用UTOOLS的语音转文本插件使用该功能！");
        }
       return null;

    }
}
