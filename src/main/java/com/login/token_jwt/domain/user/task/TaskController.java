package com.login.token_jwt.domain.user.task;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAll() { return service.findAll(); }

    @PostMapping
    public Task create(@RequestBody Task task) { return service.save(task); }


}
