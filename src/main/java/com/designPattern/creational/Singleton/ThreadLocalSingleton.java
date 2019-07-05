package com.designPattern.creational.Singleton;

/**
 *  基于ThreadLocal类的“单例模式”
 *  它并不能保证单例对象在整个应用内全局唯一，但可以保证线程内唯一
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){

    }

    //ThreadLocal隔离了多个线程对数据的访问冲突，使用ThreadLocal相当于空间换时间
    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
