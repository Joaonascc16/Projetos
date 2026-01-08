package com.example_first_project.repository;

import com.example_first_project.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long > {
}
