package com.designPattern.behavioral.Observer;

public class Test {
    public static void main(String[] args) {
        Beauty beauty = new Beauty("小丽");

        Flatterer person1 = new Flatterer("1号舔狗");
        Flatterer person2 = new Flatterer("2号舔狗");
        Flatterer person3 = new Flatterer("3号舔狗");

        //添加舔狗为好友，即添加观察者 观察 被观察对象
        beauty.addObserver(person1);
        beauty.addObserver(person2);
        beauty.addObserver(person3);

        beauty.publishMoments("今天天气真好");
    }
}
