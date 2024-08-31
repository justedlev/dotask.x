package dev.justedlev.restjobx.repository;

import dev.justedlev.restjobx.repository.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface JobRepository extends JpaRepository<Job, UUID>, JpaSpecificationExecutor<Job> {
}
