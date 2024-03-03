package com.example.decoratorpattern;

/**
 * @Author leezihong
 * @Date 2024/3/3 17:47
 * @Version 1.0
 * @description TODO
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
