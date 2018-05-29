package com.emirates.group.todo.model;

import java.util.ArrayList;

import javax.validation.Valid;

import com.emirates.group.todo.entity.TodoItem;

public class TodoListViewModel {

	@Valid
	private ArrayList<TodoItem> todoList = new ArrayList<TodoItem>();
	
	public TodoListViewModel() {}
	
	public TodoListViewModel(ArrayList<TodoItem> todoList) {
		this.todoList = todoList;
	}

	public ArrayList<TodoItem> getTodoList() {
		return todoList;
	}

	public void setTodoList(ArrayList<TodoItem> todoList) {
		this.todoList = todoList;
	}
}