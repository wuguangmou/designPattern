package com.designPattern.creational.AbstractFactory;

public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
