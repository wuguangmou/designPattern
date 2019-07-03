package com.designPattern.structural.Adapter.objectAdapter;

/*
 * 对象适配器模式，通过组合方式，实现适配器
 **/
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
