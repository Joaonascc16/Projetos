package com.example_first_project.controller;


import com.example_first_project.entity.PrioridadeEntity;
import com.example_first_project.repository.PrioridadeRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PrioridadeController {

    public final PrioridadeRepository repository;
    public PrioridadeController(PrioridadeRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<PrioridadeEntity> Listar() {
        return repository.findAll();
    }
    @PostMapping
    public PrioridadeEntity criar(@RequestBody @Valid PrioridadeEntity prioridade) {
        return repository.save(prioridade);
    }
}
