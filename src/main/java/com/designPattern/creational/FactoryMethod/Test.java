package com.designPattern.creational.FactoryMethod;


//Test类可以理解成应用层或客户端
public class Test {
    public static void main(String[] args) {
        //客户端获取JavaVideo对象
        VideoFactory videoFactory = new JavaVideoFactory(); //父类声明的引用指向子类的实现
        Video video = videoFactory.getVideo();
        video.produce();

        //客户端获取PythonVideo对象
        VideoFactory videoFactory1 = new PythonVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();

        //新增加的FEVideo对象
        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video2 = videoFactory2.getVideo();
        video2.produce();
    }
}
