package com.example_first_project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O titulo da tarefa não pode ficar em branco")
    private String titulo;

    @ManyToOne
    @NotNull (message = "Prioridade nao pode ficar vazia")
    private PrioridadeEntity prioridade;

    @ManyToOne
    @NotNull(message = "Status nao pode ficar vazio")
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

    public void setPrioridade(PrioridadeEntity prioridade) {
        this.prioridade = prioridade;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }
}
