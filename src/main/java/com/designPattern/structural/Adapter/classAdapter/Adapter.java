package com.designPattern.structural.Adapter.classAdapter;

/*
 * 类适配器模式强调的是继承
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
