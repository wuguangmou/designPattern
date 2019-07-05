package com.designPattern.creational.Prototype;

//业务场景：向中奖的同学发送邮件
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail .setContent("初始化模板");
        System.out.println("初始化mail:" + mail);

        //发送10封邮件
        for (int i = 0; i < 10; i++) {
            Mail mail1Temp = (Mail) mail.clone();   //克隆的时候，没有调用Mail的构造器
            mail1Temp.setName("姓名"+i);
            mail1Temp.setAddress("姓名" + i + "@imooc.com");
            mail1Temp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mail1Temp);
        }
        MailUtil.savaOriginMailRecord(mail);
    }
}
