package com.example_first_project.dto;

public class TaskRequest {

    private String titulo;
    private Long prioridadeId;
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
