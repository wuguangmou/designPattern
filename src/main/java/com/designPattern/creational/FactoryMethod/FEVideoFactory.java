package com.designPattern.creational.FactoryMethod;

public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
