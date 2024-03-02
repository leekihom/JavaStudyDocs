package com.example.proxypattern;

/**
 * @Author leezihong
 * @Date 2024/3/2 23:02
 * @Version 1.0
 * @description TODO
 */
public class ProxyImage implements Image{

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
