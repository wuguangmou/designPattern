package com.designPattern.behavioral.Strategy;

public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销策略，课程的价格直接减去配置的价格");
    }
}
