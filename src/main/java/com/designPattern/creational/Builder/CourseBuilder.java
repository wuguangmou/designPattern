package com.designPattern.creational.Builder;

/**
 *  课程的抽象建造者，实现交给子类
 *  若都是抽象方法，声明成接口也是可以的
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}
