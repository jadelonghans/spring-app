package com.practice.MyApp.services;


import com.practice.MyApp.mappers.ToDoItemMapper;

public class ToDoItemService {
    private ToDoItemMapper toDoItemMapper;

    public ToDoItemService(){
        toDoItemMapper = new ToDoItemMapper();
    }
}
