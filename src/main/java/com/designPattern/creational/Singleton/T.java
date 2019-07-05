package com.designPattern.creational.Singleton;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();

//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

//        ContainerSingleton.putInstance("object",new Object());
//        Object instance = ContainerSingleton.getInstance("object");

        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
