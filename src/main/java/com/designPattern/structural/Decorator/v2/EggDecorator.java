package com.designPattern.structural.Decorator.v2;

//实体的装饰者类
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋 ";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
