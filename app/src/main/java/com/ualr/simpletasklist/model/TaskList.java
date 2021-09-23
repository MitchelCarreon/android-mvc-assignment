package com.ualr.simpletasklist.model;


import java.util.HashMap;

public class TaskList {
    private static int currID;
    HashMap<Integer, Task> tasks;


    public TaskList(HashMap<Integer, Task> tasks) {
        this.tasks = tasks;
    }

    public HashMap<Integer, Task> getTasks() {
        return tasks;
    }

    public void setTasks(HashMap<Integer, Task> tasks) {
        this.tasks = tasks;
    }


    public void add(String taskDesc) {
        this.tasks.put(currID++, new Task(taskDesc, false));
    }


    @Override
    public String toString() {
        String taskList = "";
        for (HashMap.Entry<Integer, Task> task : this.tasks.entrySet()) {
            taskList += String.format("%d -  %s", task.getKey(), task.getValue().getTaskDesc());
            if (task.getValue().isTaskDone()) taskList += " Done";
            taskList += "\n";
        }
        return taskList;
    }


    public void delete(int taskID) {
        this.tasks.remove(taskID);
    }


    public void markDone(int taskID) {
        try {
            this.tasks.get(taskID).setTaskDone(true);
        } catch (Exception e) {
            return;
        }
    }

}
