package com.example.observerpattern;

/**
 * @Author leezihong
 * @Date 2024/3/3 15:24
 * @Version 1.0
 * @description TODO
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String 接收到信息 "
                + subject.getState() );
    }
}
