package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class WebController {
    List<Todo> todoList = new CopyOnWriteArrayList<>();

    @GetMapping("/listTodo")
    public String index(Model model, @RequestParam(value = "limit", required = false) Integer limit) {
        model.addAttribute("todoList", limit != null ? todoList.subList(0, limit) : todoList);
        return "listTodo";
    }

    @GetMapping("/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {
        todo = new Todo(todo.getTitle(),todo.getDetail());
        todoList.add(todo);
        return "success";
    }

    @DeleteMapping("/addTodo")
    public String Delete(@RequestParam(value = "id") String id)
    {
        System.out.println(id);
        return "success";
    }

    @GetMapping("/")
    public String index()
    {
        return "index";
    }
}
