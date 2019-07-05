package com.designPattern.behavioral.TemplateMethod;

/*
 * 设计模式课程
 **/
public class DesignPatternCourse extends ACourse{
    @Override
    void packageCourse() {
        System.out.println("提供课程java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
