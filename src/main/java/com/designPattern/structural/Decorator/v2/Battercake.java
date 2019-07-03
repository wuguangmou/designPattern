package com.designPattern.structural.Decorator.v2;

public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 6;
    }
}
