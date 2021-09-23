package com.ualr.simpletasklist.model;


import java.util.HashMap;

public class TaskList {
    private static int currID;
    HashMap<Integer, Task> tasks;
    // [DONE] TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // [DONE] TODO 04. Define the class constructor and the corresponding getters and setters.

    public TaskList(HashMap<Integer, Task> tasks) {
        this.tasks = tasks;
    }

    public HashMap<Integer, Task> getTasks() {
        return tasks;
    }

    public void setTasks(HashMap<Integer, Task> tasks) {
        this.tasks = tasks;
    }
    // [DONE] TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    public void add(String taskDesc){
        this.tasks.put(currID++, new Task(taskDesc, false));
    }

    // [DONE] TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    @Override
    public String toString() {
        String taskList = "";
        for(HashMap.Entry<Integer, Task> task : this.tasks.entrySet()){
            taskList += String.format("%d -  %s", task.getKey(), task.getValue().getTaskDesc());
            if (task.getValue().isTaskDone()) taskList += " Done";
            taskList += "\n";
        }
        return taskList;
    }


    // [DONE] TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    public void delete(int taskID){
        this.tasks.remove(taskID);
    }

    // [DONE] TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

    public void markDone(int taskID){
        this.tasks.get(taskID).setTaskDone(true);
    }

}
