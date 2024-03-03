package com.example.decoratorpattern;

/**
 * @Author leezihong
 * @Date 2024/3/3 17:18
 * @Version 1.0
 * @description TODO
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
