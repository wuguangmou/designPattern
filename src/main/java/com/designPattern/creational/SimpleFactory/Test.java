package com.designPattern.creational.SimpleFactory;

//Test类可以理解成应用层或客户端
public class Test {
    public static void main(String[] args) {

        //通过判断参数类型来创建相应的对象
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();

        //通过反射来创建相应的对象
        VideoFactory videoFactory1 = new VideoFactory();
        Video video1 = videoFactory1.getVideo(PythonVideo.class);
        if (video1 == null) {
            return;
        }
        video1.produce();
    }
}
