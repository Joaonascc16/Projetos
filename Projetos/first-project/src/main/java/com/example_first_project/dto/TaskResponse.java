package com.example_first_project.dto;

public class TaskResponse {

    private Long id;
    private String titulo;
    private Long prioridade;
    private Long status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Long prioridade) {
        this.prioridade = prioridade;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
