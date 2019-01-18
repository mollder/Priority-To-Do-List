package org.project.collabo.controller;

import org.project.collabo.domain.TodoList;
import org.project.collabo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "/todoLists", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<TodoList> findTodoList() {
        return todoService.findTodoList();
    }
}