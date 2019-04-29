package com.designPattern.creational.FactoryMethod;


/**
 *  工厂方法解决同一产品等级的创建逻辑问题，抽象工厂解决同一产品族的创建逻辑问题。
 *  此处使用Interface也是可以的，但由于在实际业务场景中，可能该工厂类的某些方法是已经实现的，因此用abstract更合适。
 *  工厂方法约束了生产某类产品的规范，指定了具体的工厂方法，将实现放在具体的子类中进行。
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
