package com.designPattern.structural.Proxy.dynamicProxy;

import com.designPattern.structural.Proxy.Order;
import com.designPattern.structural.Proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;  //目标对象

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);    //要被增强的方法的返回值对象
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理Before code");
        if (obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到[db"+dbRouter+"]处理数据");

        //to do 设置dataSource；
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }
    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
