package com.example_first_project.service;

import com.example_first_project.dto.TaskRequest;
import com.example_first_project.entity.PrioridadeEntity;
import com.example_first_project.entity.StatusEntity;
import com.example_first_project.entity.TaskEntity;
import com.example_first_project.repository.PrioridadeRepository;
import com.example_first_project.repository.StatusRepository;
import com.example_first_project.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final PrioridadeRepository prioridadeRepository;
    private final StatusRepository statusRepository;

    public TaskService(TaskRepository taskRepository, PrioridadeRepository prioridadeRepository, StatusRepository statusRepository) {
        this.taskRepository = taskRepository;
        this.prioridadeRepository = prioridadeRepository;
        this.statusRepository = statusRepository;
    }
    //CREATE
    public TaskEntity createTask(TaskRequest request) {
        // Verifica se a prioridade existe
        PrioridadeEntity prioridade = prioridadeRepository.findById(request.getPrioridadeId())
                .orElseThrow(() -> new RuntimeException("Prioridade não encontrada"));

        StatusEntity status = statusRepository.findById(request.getStatusId()).orElseThrow(() -> new RuntimeException("Status não encontrado"));

        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitulo(request.getTitulo());
        taskEntity.setPrioridade(prioridade);
        taskEntity.setStatus(status);


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
    //UPDATE
    public TaskEntity updateTask(Long id, TaskRequest request) {

        TaskEntity existingTask = findById(id);

        existingTask.setTitulo(request.getTitulo());

        existingTask.setPrioridade(
                prioridadeRepository.findById(request.getPrioridadeId())
                        .orElseThrow(() -> new RuntimeException("Prioridade não encontrada"))
        );

        existingTask.setStatus(
                statusRepository.findById(request.getStatusId())
                        .orElseThrow(() -> new RuntimeException("Status não encontrado"))
        );

        return taskRepository.save(existingTask);
    }


    //DELETE
    public void deleteTask(Long id) {
        TaskEntity existingTask = findById(id);
        taskRepository.delete(existingTask);
    }
}
