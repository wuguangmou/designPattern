package com.designPattern.creational.Builder.v2;


/**
 *  演进版本2
 *  可以按需调用，且调用之后可以链式调用
 *  其做法是将具体的实体类与实体类对应的builder创建在一个类中，方便维护
 *  在实际的链式调用中，可以设置一些默认的调用值
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    //question & answer
    private String courseQA;

    public Course(CourseBuilder courseBuilder){
        this.courseName =courseBuilder.courseName;
        this.coursePPT =courseBuilder.coursePPT;
        this.courseVideo =courseBuilder.courseVideo;
        this.courseArticle =courseBuilder.courseArticle;
        this.courseQA =courseBuilder.courseQA;

    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        //链式调用
        public CourseBuilder builderCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public CourseBuilder builderCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder builderCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder builderCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder builderCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
