package com.loda.testspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // chuyển Object trả về thành JSON
@RequestMapping("/api/v1")
public class TodoRestController {
    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    public List<Todo> findAll() {
        return todoService.getAll();
    }
}
