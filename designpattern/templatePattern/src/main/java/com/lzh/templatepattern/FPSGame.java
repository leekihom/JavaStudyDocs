package com.lzh.templatepattern;

/**
 * @Author leezihong
 * @Date 2023/4/17 0:16
 * @Version 1.0
 * @description TODO
 */
public class FPSGame extends Game{
    @Override
    void initialize() {
        System.out.println("FPSGame initialize");
    }

    @Override
    void start() {
        System.out.println("FPSGame start");
    }

    @Override
    void end() {
        System.out.println("FPSGame end");
    }
}
