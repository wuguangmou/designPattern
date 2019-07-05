package com.designPattern.behavioral.Observer;

import java.util.Observable;
import java.util.Observer;

/*
 * 舔狗，看见女神发的朋友圈立刻回复
 * 实现了Observer接口
 **/
public class Flatterer implements Observer {
    private String name;

    public Flatterer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Beauty beauty = (Beauty) o;
        String message = (String) arg;
        System.out.print(name+"收到消息：");
        System.out.println(beauty.getName() + "发布了朋友圈：" + message);
    }
}
