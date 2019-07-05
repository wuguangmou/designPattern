package com.designPattern.behavioral.State;

public class FinishedState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 播放完毕状态不能快进！");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 播放完毕状态不能暂停！");
    }

    @Override
    public void finished() {
        System.out.println("视频播放完毕状态");
    }
}
