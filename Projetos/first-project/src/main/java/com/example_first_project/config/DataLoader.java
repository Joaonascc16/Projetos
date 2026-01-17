package com.example_first_project.config;

import com.example_first_project.entity.PrioridadeEntity;
import com.example_first_project.entity.StatusEntity;
import com.example_first_project.repository.PrioridadeRepository;
import com.example_first_project.repository.StatusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final StatusRepository statusRepository;
    private final PrioridadeRepository prioridadeRepository;

    public DataLoader(StatusRepository statusRepository, PrioridadeRepository prioridadeRepository) {
        this.statusRepository = statusRepository;
        this.prioridadeRepository = prioridadeRepository;
    }

    @Override
    public void run(String... args) {
        // Implement data loading logic here

        if (statusRepository.count() == 0) {
            statusRepository.save(new StatusEntity("Pendente"));
            statusRepository.save(new StatusEntity("Em Andamento"));
            statusRepository.save(new StatusEntity("Concluído"));
        }

        if (prioridadeRepository.count() == 0) {
            prioridadeRepository.save(new PrioridadeEntity("Baixa"));
            prioridadeRepository.save(new PrioridadeEntity("Média"));
            prioridadeRepository.save(new PrioridadeEntity("Alta"));
        }
    }
}
