package com.designPattern.creational.Builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //链式调用，假设手记非必需，所以不必调用builderCourseArticle()
        Course course = new Course.CourseBuilder().builderCourseName("java设计模式精讲").builderCoursePPT("java设计模式精讲")
                .builderCourseVideo("java设计模式精讲视频").builderCourseQA("java设计模式精讲问答").build();
        System.out.println(course);

        //guava Immutable集合测试
        Set<String> set = ImmutableSet.<String>builder().add("wu").add("guang").add("mou").build();
        System.out.println(set);
    }
}
