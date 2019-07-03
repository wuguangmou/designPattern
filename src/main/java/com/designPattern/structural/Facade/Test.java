package com.designPattern.structural.Facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        //兑换礼物
        giftExchangeService.giftExchange(pointsGift);
    }
}
