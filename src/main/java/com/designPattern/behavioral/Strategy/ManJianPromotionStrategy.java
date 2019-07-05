package com.designPattern.behavioral.Strategy;

public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销策略，满200减20元");
    }
}
