package dev.justedlev.restjobx.repository.specification;

import dev.justedlev.restjobx.repository.entity.Job;
import dev.justedlev.restjobx.repository.entity.Job_;
import lombok.experimental.UtilityClass;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.*;

@UtilityClass
public class JobSpecifications {

    public static final Specification<Job> EMPTY = Specification.where(null);

    @NonNull
    public static Specification<Job> hasId(@Nullable UUID id) {
        return (root, cq, cb) -> Optional.ofNullable(id)
                .map(value -> cb.equal(root.get(Job_.id), value))
                .orElse(null);
    }

    @NonNull
    public static Specification<Job> hasIds(@Nullable UUID... ids) {
        return Optional.ofNullable(ids)
                .map(Set::of)
                .map(JobSpecifications::hasIds)
                .orElse(EMPTY);
    }

    @NonNull
    public static Specification<Job> hasIds(@Nullable Collection<UUID> ids) {
        return (root, cq, cb) -> Optional.ofNullable(ids)
                .map(List::of)
                .map(root.get(Job_.id)::in)
                .orElse(null);
    }

}
