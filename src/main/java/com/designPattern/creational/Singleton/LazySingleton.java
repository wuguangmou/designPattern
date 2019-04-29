package com.designPattern.creational.Singleton;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){
        //倘若先调用反射创建对象，后使用普通方法创建对象，此段代码不会执行，相当于抵御失败。这里区别于饿汉式，不一定能够成功。
        if (instance != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     *  使用synchronized关键字来保证线程安全
     *  synchronized关键字加在static方法上，锁的是整个类文件
     *  synchronized关键字加在普通方法上，锁的是在堆内存中生成的对象
     */
    public synchronized static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
