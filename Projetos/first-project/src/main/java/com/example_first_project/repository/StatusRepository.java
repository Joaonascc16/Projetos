package com.example_first_project.repository;

import com.example_first_project.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<StatusEntity, Long> {
}
