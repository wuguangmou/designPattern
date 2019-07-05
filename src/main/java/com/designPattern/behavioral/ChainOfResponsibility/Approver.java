package com.designPattern.behavioral.ChainOfResponsibility;

public abstract class Approver {
    //责任链中的下一处理者
    protected Approver nextAapprover;

    public void setNextApprover(Approver approver){
        this.nextAapprover = approver;
    }

    public abstract void deploy(Course course);
}
