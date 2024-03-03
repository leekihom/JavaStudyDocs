package com.example.decoratorpattern;

/**
 * @Author leezihong
 * @Date 2024/3/3 17:47
 * @Version 1.0
 * @description TODO
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
