package com.designPattern.behavioral.Strategy;

import org.apache.commons.lang3.StringUtils;

public class Test {

    //最初版本的策略模式
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new ManJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanxianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }



    //演进后的策略模式，但存在大量的if-else判断
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey,"LIJIAN")){
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        }else if (StringUtils.equals(promotionKey,"FANXIAN")){
//            promotionActivity = new PromotionActivity(new FanxianPromotionStrategy());
//        }//......
//        promotionActivity.executePromotionStrategy();
//    }


    //使用策略工厂演进后的策略模式，消除了if-else判断以及大量对象的创建
    public static void main(String[] args) {
        String promotionKey = "MANJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }

}
