package com.designPattern.creational.Prototype.abstractPrototype;


//通过抽象类来实现原型模式，A为抽象原型。若业务模型可以抽象出来，也可以使用此方式。
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
