package io.justedlev.dotaskx.controller;

import io.justedlev.dotaskx.controller.model.CreateTaskRequest;
import io.justedlev.dotaskx.controller.model.TaskResponse;
import io.justedlev.dotaskx.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

@RestController
@RequestMapping("/v1/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<Page<TaskResponse>> findAll(Pageable pageable) {
        return ResponseEntity.ok(taskService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> findAll(@PathVariable UUID id) {
        return ResponseEntity.of(taskService.findById(id));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TaskResponse> create(@RequestBody CreateTaskRequest request) {
        var res = taskService.create(request);
        var location = UriComponentsBuilder.fromPath("/v1/task").path("/" + res.id()).build().toUri();

        return ResponseEntity.created(location).body(res);
    }
}
