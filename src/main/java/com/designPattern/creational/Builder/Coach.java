package com.designPattern.creational.Builder;

//Coach类为课程教练类，主要职责就是和讲师对接,通过讲师提交的各种东西，从而拼装创建一个课程
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder=courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,String courseVideo,String courseArticle,String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
