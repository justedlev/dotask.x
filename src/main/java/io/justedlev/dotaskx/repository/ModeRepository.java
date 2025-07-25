package io.justedlev.dotaskx.repository;

import io.justedlev.dotaskx.repository.entity.Mode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.history.RevisionRepository;

import java.util.UUID;

public interface ModeRepository extends JpaRepository<Mode, UUID>, JpaSpecificationExecutor<Mode>, RevisionRepository<Mode, UUID, Long> {
}