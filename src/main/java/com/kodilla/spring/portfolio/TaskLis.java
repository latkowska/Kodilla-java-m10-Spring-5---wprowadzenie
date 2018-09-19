package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskLis {
    private final List<String> tasks;

    public TaskLis() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public String readTaskFromTaskList() {
        String task = tasks.get(0);
        return task;
    }

}
