package com.designPattern.behavioral.Observer;

import java.util.Observable;

/*
 * 女神，被观察者，继承了Observable类
 **/
public class Beauty extends Observable {
    private String name;

    public Beauty(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    //发送朋友圈
    public void publishMoments(String message){
        System.out.println(name + "发布了朋友圈："+ message);
        setChanged();
        notifyObservers(message);
    }
}
