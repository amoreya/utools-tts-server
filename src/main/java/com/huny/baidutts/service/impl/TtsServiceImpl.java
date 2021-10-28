package com.huny.baidutts.service.impl;

import com.baidu.aip.speech.AipSpeech;
import com.baidu.aip.speech.TtsResponse;
import com.huny.baidutts.common.response.ResponseUtil;
import com.huny.baidutts.common.response.ResponseVo;
import com.huny.baidutts.config.BaiDuTtsAuthConfig;
import com.huny.baidutts.model.dto.TtsDto;
import com.huny.baidutts.service.ITtsService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/28 9:01
 * @description： baiduTTS封装类
 */
@Service
public class TtsServiceImpl implements ITtsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TtsServiceImpl.class);

    @Autowired
    private BaiDuTtsAuthConfig baiDuTtsAuthConfig;

    /**
     * 文本合成语音
     * */
    @Override
    public ResponseVo< byte[] > getTts(TtsDto param) {
        if (param.getTex()==null || "".equals(param.getTex())){
            return ResponseUtil.toFailResponseVo("文本内容不能为空！");
        }
        if (param.getTex().length()>500){
            return ResponseUtil.toFailResponseVo("文本内容不能超过500字！");
        }
        if (param.getSpd()==null || "".equals(param.getSpd())){
            param.setSpd("5");
        }else {
            if (Integer.parseInt(param.getSpd()) <0 || Integer.parseInt(param.getSpd())>9){
                return ResponseUtil.toFailResponseVo("语速取值不合法！");
            }
        }

        if (param.getPit()==null || "".equals(param.getPit())){
            param.setPit("5");
        }else {
            if (Integer.parseInt(param.getPit()) <0 || Integer.parseInt(param.getPit())>9){
                return ResponseUtil.toFailResponseVo("音调取值不合法！");
            }
        }

        if (param.getVol()==null || "".equals(param.getVol())){
            param.setVol("5");
        }else {
            if (Integer.parseInt(param.getVol()) <0 || Integer.parseInt(param.getVol())>9){
                return ResponseUtil.toFailResponseVo("音量取值不合法！");
            }
        }

        if (param.getPer()==null || "".equals(param.getPer())){
            param.setPer("0");
        }else {
            if (Integer.parseInt(param.getPer()) <0 || Integer.parseInt(param.getPer())>9){
                return ResponseUtil.toFailResponseVo("发声人类型取值不合法！");
            }
        }


        // 设置可选参数
        HashMap<String, Object> options = new HashMap<String, Object>();
        options.put("spd", param.getSpd());
        options.put("pit", param.getPit());
        options.put("vol",param.getVol());
        options.put("per", param.getPer());

        // 初始化一个AipSpeech
        AipSpeech client = null;
        try {
            client = new AipSpeech(baiDuTtsAuthConfig.getAppId(), baiDuTtsAuthConfig.getApiKey(), baiDuTtsAuthConfig.getSecretKey());
        } catch (Exception e) {
            LOGGER.error("连接第三方接口失败！");
        }

        LOGGER.info("开始生成语音！");
        TtsResponse res = client.synthesis(param.getTex(), "zh", 1, options);
        byte[] data = res.getData();
        JSONObject res1 = res.getResult();
        if (data != null) {
            return ResponseUtil.toSuccessResponseVo(data);
        }
        if (res1 != null) {
            LOGGER.info("合成失败！"+res1.toString());
            return ResponseUtil.toFailResponseVo("合成失败");
        }
        return null;
    }
}

