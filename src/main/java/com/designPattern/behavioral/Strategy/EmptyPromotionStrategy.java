package com.designPattern.behavioral.Strategy;

public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
