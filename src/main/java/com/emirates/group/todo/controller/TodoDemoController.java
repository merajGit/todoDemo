package com.emirates.group.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emirates.group.todo.dao.TodoItemRepository;
import com.emirates.group.todo.entity.TodoItem;
import com.emirates.group.todo.model.TodoListViewModel;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class TodoDemoController {

    @Autowired
    private TodoItemRepository repository;

    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<TodoItem> todoList = (ArrayList<TodoItem>) repository.findAll();
        model.addAttribute("newitem", new TodoItem());
        model.addAttribute("items", new TodoListViewModel(todoList));
        return "index";
    }

    @RequestMapping("/add")
    public String addTodo(@ModelAttribute TodoItem requestItem) {
        TodoItem item = new TodoItem(requestItem.getCategory(), requestItem.getName());
        repository.save(item);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String deleteTodo(@ModelAttribute TodoListViewModel requestItems) {
        for (TodoItem requestItem : requestItems.getTodoList() ) {
             TodoItem item = new TodoItem(requestItem.getCategory(), requestItem.getName());
             if(requestItem.isDelete()){
             item.setDelete(requestItem.isDelete());
             item.setId(requestItem.getId());
             repository.delete(item);
             }
        }
        return "redirect:/";
    }
}
