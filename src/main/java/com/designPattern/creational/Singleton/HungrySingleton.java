package com.designPattern.creational.Singleton;

import java.io.Serializable;

/**
 *  饿汉式单例模式
 *  在类加载的时候就初始化好实例对象，避免了线程同步问题
 */
public class HungrySingleton implements Serializable,Cloneable {
    //声明为final的变量必须在类加载完成的时候赋值
    private final static HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    private HungrySingleton(){
        //解决反射攻击方案
        if (instance != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return instance;
    }

    //解决序列化和反序列化对单例对象的破坏
    private Object readResolve(){
        return instance;
    }

    //检查clone对单例的破坏。实现在原型模式的clone包的Test类下。
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();   //保证克隆方法获取到的是同一个对象
    }
}
