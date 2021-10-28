package com.huny.baidutts.util;

import java.util.Date;

/**
 * @author： yaoqh
 * @date： Created in 2021/10/28 11:23
 * @description： 获取时间戳（秒）的工具类
 */
public class TimeUtil {

    /**
     * 获取精确到秒的时间戳
     *
     * @return
     *
     */
    public static Long getSecondTimestamp(Date date){
        if (null == date) {
            return 0L;
        }
        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return Long.valueOf(timestamp.substring(0,length-3));
        } else {
            return 0L;
        }
    }
}
