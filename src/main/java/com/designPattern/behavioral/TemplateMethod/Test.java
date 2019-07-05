package com.designPattern.behavioral.TemplateMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("--后端设计模式课程start--");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("--后端设计模式课程end--");


        System.out.println("--前端视频课程start--");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("--前端视频课程end--");
    }
}
