package org.project.collabo.service;

import org.project.collabo.domain.TodoList;
import org.project.collabo.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoListRepository todoListRepository;

    public List<TodoList> findTodoList() {
        return todoListRepository.findAllBy();
    }
}
