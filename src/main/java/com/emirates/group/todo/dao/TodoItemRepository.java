package com.emirates.group.todo.dao;

import org.springframework.data.repository.CrudRepository;

import com.emirates.group.todo.entity.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}