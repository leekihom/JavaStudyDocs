package com.example.singlepattern;

/**
 * @Author leezihong
 * @Date 2024/3/2 18:15
 * @Version 1.0
 * @description TODO
 */
public class SingleObject {
    //饿汉式
    /*private static final SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return  instance;
    }*/

    //懒汉式
    private static SingleObject instance;

    private SingleObject(){}

    public synchronized static SingleObject getInstance(){
        if (instance == null){
            instance = new SingleObject();
        }
        return  instance;
    }


}
