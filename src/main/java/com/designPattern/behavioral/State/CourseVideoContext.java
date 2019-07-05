package com.designPattern.behavioral.State;

public class CourseVideoContext {
    private CourseVideoState courseVideoState;
    public static final PlayState PLAY_STATE = new PlayState();
    public static final SpeedState SPEED_STATE = new SpeedState();
    public static final PauseState PAUSE_STATE = new PauseState();
    public static final FinishedState FINISHED_STATE = new FinishedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play(){
        this.courseVideoState.play();
    }

    public void speed(){
        this.courseVideoState.speed();
    }

    public void pause(){
        this.courseVideoState.pause();
    }

    public void finished(){
        this.courseVideoState.finished();
    }
}
