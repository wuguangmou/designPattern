package com.designPattern.structural.Proxy.dynamicProxy;

import com.designPattern.structural.Proxy.IOrderService;
import com.designPattern.structural.Proxy.Order;
import com.designPattern.structural.Proxy.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
