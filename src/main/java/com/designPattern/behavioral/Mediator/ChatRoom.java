package com.designPattern.behavioral.Mediator;

import java.util.Date;

/*
 * 聊天室，充当中介者
 **/
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println("-----------聊天室内容------------");
        System.out.println(new Date().toString() + "[" + user.getName() + "]:" + message);
    }
}
