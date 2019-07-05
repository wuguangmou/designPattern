package com.designPattern.creational.FactoryMethod;

public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端课程视频");
    }
}
