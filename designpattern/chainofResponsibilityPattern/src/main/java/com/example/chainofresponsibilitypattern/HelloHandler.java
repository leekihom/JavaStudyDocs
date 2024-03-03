package com.example.chainofresponsibilitypattern;

import java.util.PrimitiveIterator;

/**
 * @Author leezihong
 * @Date 2024/3/3 18:26
 * @Version 1.0
 * @description TODO
 */
public class HelloHandler extends ApprovalHandler{

    public HelloHandler(String str){
        this.name = str;
    }
    @Override
    public void approval(ApprovalHandler approvalHandler) {
        System.out.println("hello " + this.name);
    }
}
