package com.practice.MyApp.controllers;

import com.practice.MyApp.services.ToDoItemService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ToDoItemController {

    private ToDoItemService toDoItemService = new ToDoItemService();;


    // write methods to map each path of web app to some page or action
    @GetMapping("/")
    String getAll(Model model){
        return "toppage";
    }

    @PostMapping("/")
    String submitSth(Model model){
        return "nothing";
    }
}
