package com.designPattern.behavioral.Mediator;

public class Test {
    public static void main(String[] args) {
        User John =new User("John");
        User Chris_Wu =new User("Chris_Wu");
        User Tom =new User("Tom");

        John.sendMessage("hello");
        Chris_Wu.sendMessage("大家好，我是吴广谋");
        Tom.sendMessage("嘿嘿嘿");
    }
}
