package com.designPattern.creational.Singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

//容器单例模式
public class ContainerSingleton {
    //虽然hashMap不是线程安全的，但在类初始化的时候就初始化好Map，将所有对象都放入map中，用的时候直接取，在某些业务场景中也是可以的
    //若使用hashTable，虽然是线程安全的，但每次操作都会加锁解锁，对性能影响很大，不建议使用
    private static Map<String,Object> singletonMap = new HashMap<>();

    private ContainerSingleton(){

    }
    public static void putInstance(String key,Object instance){
        if (StringUtils.isNotBlank(key) && instance != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
