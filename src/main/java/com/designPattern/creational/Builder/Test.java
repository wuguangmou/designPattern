package com.designPattern.creational.Builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        //此版本的建造者很容易将参数写串，不值得推荐
        Course course = coach.makeCourse("java设计模式精讲","java设计模式精讲PPT"
        ,"java设计模式精讲视频","java设计模式精讲手记","java设计模式精讲问答");

        System.out.println(course);
    }
}
