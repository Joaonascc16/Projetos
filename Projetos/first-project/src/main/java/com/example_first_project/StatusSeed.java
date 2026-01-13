package com.example_first_project;

import com.example_first_project.entity.StatusEntity;
import com.example_first_project.repository.StatusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class StatusSeed implements CommandLineRunner {

    private final StatusRepository statusRepository;

    public StatusSeed(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }
    @Override
    public void run(String... args) {
        if (statusRepository.count() == 0) {
            StatusEntity pendente = new StatusEntity();
            pendente.setNome("PENDENTE");

            StatusEntity emAndamento = new StatusEntity();
            emAndamento.setNome("EM ANDAMENTO");

            StatusEntity concluido = new StatusEntity();
            concluido.setNome("CONCLUÍDO");

            statusRepository.saveAll(
                    List.of(pendente, emAndamento, concluido)
            );
        }
    }

}
