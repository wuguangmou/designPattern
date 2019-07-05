package com.designPattern.behavioral.Visitor;

public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
