package com.designPattern.creational.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton instance = LazySingleton.getInstance();


        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        //ThreadLocal类测试，main线程中获取到的对象总是同一个
        System.out.println("main thread"+ThreadLocalSingleton.getInstance());
        System.out.println("main thread"+ThreadLocalSingleton.getInstance());
        System.out.println("main thread"+ThreadLocalSingleton.getInstance());
        System.out.println("main thread"+ThreadLocalSingleton.getInstance());
        System.out.println("main thread"+ThreadLocalSingleton.getInstance());

        //序列化攻击测试
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SingletonFile"));
//        oos.writeObject(instance);
//
//        File file = new File("SingletonFile");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        //反射攻击测试1
//        Mail objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        //反射攻击测试2
//        Mail objectClass = LazySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        //先调用反射方法创建对象，private构造函数中的抵御代码不会生效
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();

//        //枚举单例序列化测试
//        EnumSingleton instance = EnumSingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SingletonFile"));
//        oos.writeObject(instance);
//
//        File file = new File("SingletonFile");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumSingleton newInstance = (EnumSingleton) ois.readObject();

        //枚举单例之反射测试
//        Mail objectClass = EnumSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        EnumSingleton newInstance = (EnumSingleton) constructor.newInstance("Chris Wu","666");
//        EnumSingleton instance = EnumSingleton.getInstance();

//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
        System.out.println("program end");
    }
}
