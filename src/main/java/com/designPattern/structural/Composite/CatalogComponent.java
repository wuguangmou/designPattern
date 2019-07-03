package com.designPattern.structural.Composite;

/*
 * 抽象的目录组件
 * 业务场景：有不同的课程，也有不同的课程目录，使课程的目录和课程继承同一个抽象类
 **/
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }
    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
