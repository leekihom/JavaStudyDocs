package com.example.proxypattern;

/**
 * @Author leezihong
 * @Date 2024/3/2 22:59
 * @Version 1.0
 * @description TODO
 */

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loading(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示 " + fileName);
    }
    private void loading(String fileName){
        System.out.println("加载..." + fileName);
    }
}
