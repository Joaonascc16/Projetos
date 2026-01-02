package com.example_first_project.service;

import com.example_first_project.entity.TaskEntity;
import com.example_first_project.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    //CREATE
    public TaskEntity createTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }
    //READ TODOS
    public List<TaskEntity> findAll() {
        return taskRepository.findAll();
    }
    //READ POR ID
    public TaskEntity findById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));


    }
    public TaskEntity updateTask(Long id, TaskEntity uptadeTaskEntity) {
        TaskEntity existingTask = findById(id);

        existingTask.setTitulo(updateTaskEntity.getTitulo());
        existingTask.setDescricao(updateTaskEntity.getDescricao());
        existingTask.setData(updateTaskEntity.getData());
        existingTask.setStatus(updateTaskEntity.getStatus());
        existingTask.setPrioridade(updateTaskEntity.getPrioridade());
        return taskRepository.save(existingTask);

    }
}
