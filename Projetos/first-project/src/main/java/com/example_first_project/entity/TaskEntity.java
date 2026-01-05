package com.example_first_project.entity;

import jakarta.persistence.*;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    private PrioridadeEntity prioridade;

    @ManyToOne
    private StatusEntity status;

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

    public PrioridadeEntity getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
