package com.ualr.simpletasklist.model;

public class Task {

    private String taskDesc;
    private boolean taskDone;

    // [DONE ]TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

// [DONE] TODO 02. Define the class constructor and the corresponding getters and setters.

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
