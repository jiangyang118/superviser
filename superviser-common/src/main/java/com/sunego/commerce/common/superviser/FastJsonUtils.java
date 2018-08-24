package com.sunego.commerce.common.superviser;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtils {

    private FastJsonUtils() {

    }

    public static <T> T fromJson(String json, Class<T> clzss) {
        return JSON.parseObject(json, clzss);
    }

    public static <T> List<T> fromJson2List(String json, Class<T> clzss) {
        return JSON.parseArray(json, clzss);
    }

    public static <T> String toJson(T data) {
        return JSON.toJSONString(data, SerializerFeature.WriteMapNullValue);
    }

    public static <T> String toJsonOrEmpty(T data) {
        return JSON.toJSONString(data, SerializerFeature.WriteMapNullValue);
    }
}
