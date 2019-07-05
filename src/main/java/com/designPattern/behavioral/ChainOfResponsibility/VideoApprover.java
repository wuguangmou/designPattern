package com.designPattern.behavioral.ChainOfResponsibility;

import org.apache.commons.lang3.StringUtils;

public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频，批准");
            if (nextAapprover != null){
                nextAapprover.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有视频，不批准，流程结束");
            return;
        }
    }
}
