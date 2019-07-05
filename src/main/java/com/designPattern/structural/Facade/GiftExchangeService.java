package com.designPattern.structural.Facade;

/*
 * 礼物兑换系统，其中包括了物流子系统、资格校验子系统、积分支付子系统。
 * 对外提供了一个兑换积分礼物方法
 **/
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();


    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if (pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是"+ shippingOrderNo);
            }
        }
    }
}
