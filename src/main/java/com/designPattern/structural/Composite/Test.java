package com.designPattern.structural.Composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux课程",99);
        CatalogComponent windowsCourse = new Course("windows课程",66);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("java电商一期课程",150);
        CatalogComponent mmallCourse2 = new Course("java电商二期课程",200);
        CatalogComponent designPattern = new Course("java设计模式",250);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
