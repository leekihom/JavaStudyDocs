package com.example.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author leezihong
 * @Date 2024/3/3 15:06
 * @Version 1.0
 * @description TODO
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
