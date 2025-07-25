package io.justedlev.dotaskx.service.impl;

import io.justedlev.dotaskx.controller.model.CreateTaskRequest;
import io.justedlev.dotaskx.controller.model.TaskResponse;
import io.justedlev.dotaskx.repository.TaskRepository;
import io.justedlev.dotaskx.repository.entity.Task;
import io.justedlev.dotaskx.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public Page<TaskResponse> findAll(Pageable pageable) {
        return taskRepository.findAll(pageable).map(this::map);
    }

    @Override
    public TaskResponse create(CreateTaskRequest request) {
        var entity = Task.builder()
                .command(request.command())
                .name(request.name())
                .build();

        return map(taskRepository.save(entity));
    }

    @Override
    public Optional<TaskResponse> findById(UUID id) {
        return taskRepository.findById(id).map(this::map);
    }

    private TaskResponse map(Task entity) {
        return TaskResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .command(entity.getCommand())
                .version(entity.getVersion())
                .createdBy(entity.getCreatedBy())
                .createdAt(entity.getCreatedAt().toLocalDateTime())
                .modifiedBy(entity.getModifiedBy())
                .modifiedAt(entity.getModifiedAt().toLocalDateTime())
                .build();
    }
}
