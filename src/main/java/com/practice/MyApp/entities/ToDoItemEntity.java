package com.practice.MyApp.entities;

import lombok.Data;

import java.text.DateFormat;

@Data
public class ToDoItemEntity {
    private Long id;
    private String title;
    private DateFormat deadline;
    private DateFormat createdDate;
}
