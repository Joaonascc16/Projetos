package com.example_first_project.controller;

import com.example_first_project.entity.StatusEntity;
import com.example_first_project.repository.StatusRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final StatusRepository repository;

    public StatusController(StatusRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<StatusEntity> Listar() {
        return repository.findAll();
    }
    @PostMapping
    public StatusEntity inserir(@RequestBody @Valid StatusEntity status) {
        return repository.save(status);
    }
}
