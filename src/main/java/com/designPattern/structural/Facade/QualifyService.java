package com.designPattern.structural.Facade;

/*
 *  资格校验子系统
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+"积分资格通过，库存通过");
        return true;
    }
}
