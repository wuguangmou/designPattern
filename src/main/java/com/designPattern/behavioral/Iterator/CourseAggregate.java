package com.designPattern.behavioral.Iterator;

public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
