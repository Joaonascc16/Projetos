package com.example_first_project.controller;


import com.example_first_project.dto.TaskRequest;
import com.example_first_project.entity.TaskEntity;
import com.example_first_project.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //CREATE
    @PostMapping
    public ResponseEntity<TaskEntity> createTask(@Valid @RequestBody TaskRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.createTask(request));
    }
    //READ - Todas as tarefas
    @GetMapping
    public ResponseEntity<List<TaskEntity>> getAllTasks() {
        return ResponseEntity.ok(taskService.findAll());
    }
    //READ - Tarefa por ID
    @GetMapping("/{id}")
    public ResponseEntity<TaskEntity> FindById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.findById(id));
    }
    //UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<TaskEntity> updade(
            @PathVariable Long id,
            @Valid @RequestBody TaskRequest request
    ) {
        return ResponseEntity.ok(taskService.updateTask(id, request));
    }
    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }

}
