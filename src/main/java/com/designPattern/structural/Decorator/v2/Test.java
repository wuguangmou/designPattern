package com.designPattern.structural.Decorator.v2;

public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);    //加鸡蛋
        aBattercake = new SausageDecorator(aBattercake);//加火腿
        aBattercake = new SausageDecorator(aBattercake);//加火腿
        aBattercake = new EggDecorator(aBattercake);    //加鸡蛋

        System.out.println(aBattercake.getDesc() + "售价：" + aBattercake.cost());
    }
}
