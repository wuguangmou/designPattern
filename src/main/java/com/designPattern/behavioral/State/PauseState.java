package com.designPattern.behavioral.State;

public class PauseState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放视频状态");
    }

    @Override
    public void finished() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.FINISHED_STATE);
    }
}
