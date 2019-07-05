package com.designPattern.creational.FactoryMethod;


public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制python课程视频");
    }
}
