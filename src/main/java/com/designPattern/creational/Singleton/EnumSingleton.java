package com.designPattern.creational.Singleton;

/**
 *  推荐使用的单例模式
 *  使用枚举单例可以防止序列化和反射对单例对象造成的破坏
 *  由反编译可以看出，Enum单例实例是在类加载的时候就初始化好了，在static代码块中，且单例对象是不可变的
 */
public enum  EnumSingleton {

    INSTANCE;
    private Object data;

    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data=data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
