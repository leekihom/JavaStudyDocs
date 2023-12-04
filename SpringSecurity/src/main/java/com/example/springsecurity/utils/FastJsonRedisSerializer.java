package com.example.springsecurity.utils;




import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.Charset;

/**
 * @author leezihong
 * @date 2022/12/13 19:42
 * @description fastjson序列化
 */
public class FastJsonRedisSerializer<T> implements RedisSerializer<T> {

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private Class<T> clazz;

    public FastJsonRedisSerializer(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }

    @Override
    public byte[] serialize(T t) throws SerializationException {
        if (t == null) {
            return new byte[0];
        }
        // byte[] bytes = JSON.toJSONString(t, SerializerFeature.WriteClassName, ).getBytes(DEFAULT_CHARSET);
        byte[] bytes = JSON.toJSONString(t, SerializerFeature.WriteClassName,
                // 是否输出值为null的字段,默认为false
                SerializerFeature.WriteMapNullValue,
                // List字段如果为null,输出为[],而非null
                SerializerFeature.WriteNullListAsEmpty).getBytes(DEFAULT_CHARSET);
        return bytes;
    }

    @Override
    public T deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length <= 0) {
            return null;
        }
        String str = new String(bytes, DEFAULT_CHARSET);
        return (T) JSON.parseObject(str, clazz);
    }
}