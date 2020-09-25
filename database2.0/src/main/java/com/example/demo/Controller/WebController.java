package com.example.demo.Controller;

import com.example.demo.Entity.Todo;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Repository.TodoRepository;
import com.example.demo.Entity.Todo;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Entity.User;

@Controller
public class WebController {

    @Autowired
    TodoRepository todoRepository;

    @Autowired
    UserRepository userRepository;

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
        System.out.println(todo.getId());
        System.out.println(todo.getUser());
        //todoRepository.save(todo);
        return "success";
    }

    @DeleteMapping("/addTodo")
    public String Delete(@RequestParam(value = "id") String id)
    {
        todoRepository.deleteById(Long.parseLong(id));
        return "success";
    }

    @GetMapping("/user")
    public String adduser()
    {
        User user = new User("a","b");
        userRepository.save(user);
        return "success";
    }


}
