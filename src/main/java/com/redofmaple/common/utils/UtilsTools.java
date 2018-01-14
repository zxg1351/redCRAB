package com.redofmaple.common.utils;

import java.util.UUID;

/**
 *工具类
 */
public class UtilsTools {

    /**
     * 生成UUID
     * @return
     */
    public String generateUUID(){
        String result = UUID.randomUUID().toString();
        return result;
    }
}
