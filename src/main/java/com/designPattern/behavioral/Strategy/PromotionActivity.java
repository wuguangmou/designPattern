package com.designPattern.behavioral.Strategy;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
