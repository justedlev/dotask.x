package io.justedlev.dotaskx.repository;

import io.justedlev.dotaskx.repository.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.history.RevisionRepository;

public interface StatusRepository extends JpaRepository<Status, Long>, JpaSpecificationExecutor<Status>, RevisionRepository<Status, Long, Integer> {
}