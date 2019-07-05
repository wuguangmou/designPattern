package com.designPattern.behavioral.ChainOfResponsibility;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())){
            System.out.println(course.getName()+"含有手记，批准");
            if (nextAapprover != null){
                nextAapprover.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有手记，不批准，流程结束");
            return;
        }
    }
}
