package org.project.collabo.repository;

import org.project.collabo.domain.TodoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoListRepository extends CrudRepository<TodoList, Integer> {
    List<TodoList> findAllBy();
}
