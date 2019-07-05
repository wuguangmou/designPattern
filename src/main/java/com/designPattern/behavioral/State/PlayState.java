package com.designPattern.behavioral.State;

public class PlayState extends CourseVideoState{
    @Override
    public void play() {
        System.out.println("正常播放视频状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void finished() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.FINISHED_STATE);
    }
}
