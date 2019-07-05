package com.designPattern.creational.AbstractFactory;

/**
 *  新增的产品族，一门课程只有视频是不够的，还需有对应的手记，这样才算一门课程
 *  在这个例子中，相同类型的课程/手记属于同一产品等级，，而同一课程的视频和手记属于同一产品族
 */
//产品族的工厂,约定了产品的具体属性与方法
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
