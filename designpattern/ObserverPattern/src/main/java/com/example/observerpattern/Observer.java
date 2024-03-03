package com.example.observerpattern;

/**
 * @Author leezihong
 * @Date 2024/3/3 15:06
 * @Version 1.0
 * @description 抽象观察者类
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
