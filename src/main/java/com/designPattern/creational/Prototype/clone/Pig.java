package com.designPattern.creational.Prototype.clone;

import java.util.Date;

/**
 *  clone包用于学习深克隆与浅克隆
 *  浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于引用类型，仍然指向原有属性所指向的对象的内存地址。
 *  深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，且不再指向原有对象地址。
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthday;
    private Integer weight;

    public Pig(String name, Date birthday, Integer weight) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        //深克隆(单独为引用类型实现克隆)
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", weight=" + weight +
                '}' + super.toString();
    }
}
