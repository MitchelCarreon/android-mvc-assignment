package com.ualr.simpletasklist.model;

public class Task {

    private String taskDesc;
    private boolean taskDone;


    public Task(String taskDesc, boolean taskDone) {
        this.taskDesc = taskDesc;
        this.taskDone = taskDone;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public boolean isTaskDone() {
        return taskDone;
    }

    public void setTaskDone(boolean taskDone) {
        this.taskDone = taskDone;
    }
}
