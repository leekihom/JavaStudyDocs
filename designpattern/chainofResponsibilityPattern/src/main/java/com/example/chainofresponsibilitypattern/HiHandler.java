package com.example.chainofresponsibilitypattern;

/**
 * @Author leezihong
 * @Date 2024/3/3 19:55
 * @Version 1.0
 * @description TODO
 */
public class HiHandler extends ApprovalHandler{

    public HiHandler(String str){
        this.name = str;
    }
    @Override
    public void approval(ApprovalHandler approvalHandler) {
        System.out.println("hi " + this.name);
    }
}
