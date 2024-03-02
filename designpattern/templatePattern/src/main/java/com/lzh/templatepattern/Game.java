package com.lzh.templatepattern;

/**
 * @Author leezihong
 * @Date 2023/4/17 0:14
 * @Version 1.0
 * @description TODO
 */
public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}
