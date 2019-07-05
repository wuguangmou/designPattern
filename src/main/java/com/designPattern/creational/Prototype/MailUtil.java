package com.designPattern.creational.Prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学，邮件地址:{1}，邮件内容:{2} 发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getAddress(), mail.getContent()));
    }

    public static void savaOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，originMail:"+mail.getContent());
    }
}
