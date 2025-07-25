package io.justedlev.dotaskx.service;

import io.justedlev.dotaskx.controller.model.CreateTaskRequest;
import io.justedlev.dotaskx.controller.model.TaskResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    Page<TaskResponse> findAll(Pageable pageable);

    TaskResponse create(CreateTaskRequest request);

    Optional<TaskResponse> findById(UUID id);
}
