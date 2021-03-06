package com.example.demo.Controller;

import com.example.demo.Entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Repository.TodoRepository;
import com.example.demo.Entity.Todo;

@Controller
public class WebController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/listTodo")
    public String index(Model model) {
        model.addAttribute("todoList",todoRepository.findAll());
        return "listTodo";
    }

    @GetMapping("/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @PostMapping("/addTodo")
    public String addTodo(Todo todo) {
        todoRepository.save(todo);
        return "success";
    }

    @DeleteMapping("/addTodo")
    public String Delete(@RequestParam(value = "id") String id)
    {
        todoRepository.deleteById(Long.parseLong(id));
        return "success";
    }

}
