package com.example.observerpattern;

/**
 * @Author leezihong
 * @Date 2024/3/3 15:19
 * @Version 1.0
 * @description 实体观察者类
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "BinaryObserver 接收到信息"
                + subject.getState());
    }
}
