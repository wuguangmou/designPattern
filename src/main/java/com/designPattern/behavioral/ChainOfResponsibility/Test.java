package com.designPattern.behavioral.ChainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java设计模式精讲");
        course.setArticle("java设计模式手记");
        course.setVideo("java设计模式视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
