package com.designPattern.creational.Singleton;

/**
 *  基于静态内部类的、线程安全的延迟化加载方案
 *  使用静态内部类，外界线程无法看到内部类中的指令重排序
 *  静态内部类的方式也是懒汉式，只有这个类在第一次使用时才会被加载
 *  与synchronized加在静态方法上来比，这种方式的性能开销也比较低
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){

    }

    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
}
