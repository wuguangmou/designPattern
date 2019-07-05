package com.designPattern.structural.Proxy.staticProxy;

import com.designPattern.structural.Proxy.IOrderService;
import com.designPattern.structural.Proxy.Order;
import com.designPattern.structural.Proxy.OrderServiceImpl;
import com.designPattern.structural.Proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy extends Order {
    private IOrderService iOrderService;    //注入目标对象，对saveOrder方法进行增强

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl(); //若使用spring容器，则不需要显式去new
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }
    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到[db"+dbRouter+"]处理数据");

        //to do 设置dataSource；
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
