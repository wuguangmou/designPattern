package com.designPattern.behavioral.Strategy;

public class FanxianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销策略，返回的金额存放到用户余额中");
    }
}
