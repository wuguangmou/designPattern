package com.designPattern.structural.Decorator.v2;

//实体的装饰者类
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠 ";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
