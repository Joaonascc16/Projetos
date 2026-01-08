package com.example_first_project.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TaskRequest {



    @NotBlank(message = "O nome da tarefa não pode ficar vazio")
    private String titulo;

    @NotNull(message = "A Id da prioridade não pode ficar vazia")
    private Long prioridadeId;

    @NotNull(message = "O Id do status não pode ficar vazio")
    private Long statusId;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getPrioridadeId() {
        return prioridadeId;
    }

    public void setPrioridadeId(Long prioridadeId) {
        this.prioridadeId = prioridadeId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }
}
