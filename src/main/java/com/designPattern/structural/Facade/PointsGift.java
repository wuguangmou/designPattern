package com.designPattern.structural.Facade;
/*
 * 业务场景：使用积分兑换礼物，其中包括了物流子系统、资格校验子系统、积分支付子系统等。
 * 对外通过使用礼物兑换的外观类将这些逻辑封装起来
 **/
public class PointsGift {
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
