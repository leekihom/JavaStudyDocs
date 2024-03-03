package com.example.chainofresponsibilitypattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainofResponsibilityPatternApplication {

    private static ApprovalHandler  getChain(){
        ApprovalHandler helloHandler = new HelloHandler("java");
        ApprovalHandler hiHandler = new HelloHandler("C#");

        helloHandler.setNextHanlder(hiHandler);

        return helloHandler;
    }
    public static void main(String[] args) {
        ApprovalHandler chain = getChain();
        //chain.approval(new HelloHandler("C++"));
        chain.next.print();
    }

}
