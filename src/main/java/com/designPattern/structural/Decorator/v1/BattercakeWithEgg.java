package com.designPattern.structural.Decorator.v1;

public class BattercakeWithEgg extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
