package com.designPattern.creational.Prototype.clone;

import com.designPattern.creational.Singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig = new Pig("佩奇",birthday,10);
        Pig pig1 = (Pig) pig.clone();

        System.out.println(pig);
        System.out.println(pig1);

        //改变小猪佩奇的生日
        pig.setBirthday(new Date(666666666666L));
        System.out.println(pig);
        System.out.println(pig1);

/*----------------------------------------------------我是分割线-------------------------------------------------------*/
        //单例对象克隆测试，为防止克隆破坏单例，要么单例对象不实现Cloneable接口，要么重写clone方法
//        HungrySingleton instance = HungrySingleton.getInstance();
//        Method method = instance.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//
//        HungrySingleton cloneInstance = (HungrySingleton) method.invoke(instance);
//        System.out.println(instance);
//        System.out.println(cloneInstance);
    }
}
