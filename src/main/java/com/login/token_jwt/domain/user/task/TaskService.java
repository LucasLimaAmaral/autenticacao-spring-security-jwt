package com.login.token_jwt.domain.user.task;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAll() { return repository.findAll(); }
    public Task save(Task task) { return repository.save(task); }
    public void delete(Long id) { repository.deleteById(id); }
}

