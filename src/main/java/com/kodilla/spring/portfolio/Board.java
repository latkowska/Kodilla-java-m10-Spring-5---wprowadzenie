package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Board {

    @Autowired
    @Qualifier("toDoList")
    public TaskLis toDoList;

    @Autowired
    @Qualifier("inProgressList")
    public TaskLis inProgressList;

    @Autowired
    @Qualifier("doneList")
    public TaskLis doneList;

    public TaskLis addTaskToDoList() {
        toDoList.add("Shopping.");
        return toDoList;
    }

    public TaskLis addTaskToinProgressList() {
        inProgressList.add("Read a book.");
        return inProgressList;
    }

    public TaskLis addTaskToDoneList() {
        doneList.add("Watch a movie.");
        return doneList;
    }

}
