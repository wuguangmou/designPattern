package com.designPattern.structural.Decorator.v1;

/*
 * 业务场景：煎饼果子，可以加蛋，可以加肠，加不同的东西计算的价格不同
 **/
public class Battercake {
    protected String getDesc(){
        return "煎饼";
    }

    protected int cost(){
        return 6;
    }
}
