package com.designPattern.creational.Prototype;

/**
 *  假设Mail对象比较复杂，且创建比较消耗性能
 *  Mail对象作为原型实例
 *  使用原型模式可以解决构建复杂对象的资源消耗问题
 */
public class Mail implements Cloneable{
    private String name;
    private String address;
    private String content;

    public Mail(){
        System.out.println("Mail Class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
