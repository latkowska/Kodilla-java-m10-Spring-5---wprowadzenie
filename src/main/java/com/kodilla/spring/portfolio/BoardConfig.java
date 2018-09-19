package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

    @Bean(name = "toDoList")
    public TaskLis createToDoList() {
        return new TaskLis();
    }

    @Bean(name = "inProgressList")
    public TaskLis createinProgressList() {
        return new TaskLis();
    }

    @Bean(name = "doneList")
    public TaskLis createdoneList() {
        return new TaskLis();
    }
}
