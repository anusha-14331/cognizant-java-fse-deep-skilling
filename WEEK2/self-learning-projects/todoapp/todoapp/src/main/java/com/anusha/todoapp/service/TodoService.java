package com.anusha.todoapp.service;



import com.anusha.todoapp.entity.Todo;
import com.anusha.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    // CREATE
    public Todo saveTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // READ ALL
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // READ BY ID
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // DELETE
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
