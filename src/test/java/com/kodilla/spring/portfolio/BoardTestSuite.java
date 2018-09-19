package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void addTaskToDoList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList();
        board.addTaskToinProgressList();
        board.addTaskToDoneList();
        //Then
        TaskLis task1 = (TaskLis) context.getBean("toDoList");
        TaskLis task2 = (TaskLis) context.getBean("inProgressList");
        TaskLis task3 = (TaskLis) context.getBean("doneList");

        String taskOneResult = task1.readTaskFromTaskList();
        String taskTwoResult = task2.readTaskFromTaskList();
        String taskThreeResult = task3.readTaskFromTaskList();

        Assert.assertEquals("Shopping.",taskOneResult);
        Assert.assertEquals("Read a book.",taskTwoResult);
        Assert.assertEquals("Watch a movie.",taskThreeResult);

        System.out.println(taskOneResult);
        System.out.println(taskTwoResult);
        System.out.println(taskThreeResult);


    }
}
