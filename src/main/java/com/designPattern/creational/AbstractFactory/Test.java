package com.designPattern.creational.AbstractFactory;

//客户端需要新增产品族变得十分方便，且不用关心具体产品是如何生产的
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

        CourseFactory courseFactory1 = new PythonCourseFactory();
        Video video1 = courseFactory1.getVideo();
        Article article1 = courseFactory1.getArticle();
        video1.produce();
        article1.produce();
    }
}
