package com.designPattern.behavioral.TemplateMethod;

/*
 * 前端课程
 **/
public class FECourse extends ACourse {
    private boolean needWriteArticle = false;
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等素材");
    }

    public FECourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticle;
    }
}
