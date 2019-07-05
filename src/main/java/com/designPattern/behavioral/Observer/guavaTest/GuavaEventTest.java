package com.designPattern.behavioral.Observer.guavaTest;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("post的内容");
    }
}
