package com.sqnugy.orangeblog.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName JsonUtil
 * @description JsonUtil 是一个工具类，提供了将对象转换为JSON字符串的功能。
 * 注意：此工具类中的所有方法均为静态方法，因此可以直接通过类名调用。
 * @date 2024-12-07
 */

@Slf4j
public class JsonUtil {

    /**
     * 静态常量 ObjectMapper 实例，用于执行 JSON 序列化和反序列化操作。
     */
    private static final ObjectMapper INSTANCE = new ObjectMapper();

    public static String toJsonString(Object obj) {
        try {
            return INSTANCE.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return obj.toString();
        }
    }
}

