package com.example.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author leezihong
 * @Date 2023/2/14 16:13
 * @Version 1.0
 * @description TODO
 */
public class customerBlockHandler {
    public static String handlerException(BlockException exception) {

        return "自定义处理逻辑 global handlerException";
    }
}
