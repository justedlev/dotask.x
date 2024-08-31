package dev.justedlev.restjobx.repository.specification;

import dev.justedlev.restjobx.repository.entity.Auditable;
import dev.justedlev.restjobx.repository.entity.Auditable_;
import lombok.experimental.UtilityClass;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@UtilityClass
public class AuditableSpecifications {

    public static final Specification<Auditable> EMPTY = Specification.where(null);

    @NonNull
    public static Specification<Auditable> hasCreatedBy(@Nullable String createdBy) {
        return (root, cq, cb) -> Optional.ofNullable(createdBy)
                .map(value -> cb.equal(root.get(Auditable_.createdBy), value))
                .orElse(null);
    }

    @NonNull
    public static Specification<Auditable> hasCreatedBy(@Nullable String... createdBys) {

        if (ArrayUtils.isEmpty(createdBys)) {
            return EMPTY;
        }

        return AuditableSpecifications.hasCreatedBy(Set.of(createdBys));
    }

    @NonNull
    public static Specification<Auditable> hasCreatedBy(@Nullable Collection<String> createdBys) {
        return (root, cq, cb) -> Optional.ofNullable(createdBys)
                .filter(CollectionUtils::isNotEmpty)
                .map(root.get(Auditable_.createdBy)::in)
                .orElse(null);
    }

    @NonNull
    public static Specification<Auditable> hasModifiedBy(@Nullable String modifiedBy) {
        return (root, cq, cb) -> Optional.ofNullable(modifiedBy)
                .map(value -> cb.equal(root.get(Auditable_.modifiedBy), value))
                .orElse(null);
    }

    @NonNull
    public static Specification<Auditable> hasModifiedBy(@Nullable String... modifiedBys) {

        if (ArrayUtils.isEmpty(modifiedBys)) {
            return EMPTY;
        }

        return AuditableSpecifications.hasCreatedBy(Set.of(modifiedBys));
    }

    @NonNull
    public static Specification<Auditable> hasModifiedBy(@Nullable Collection<String> modifiedBys) {
        return (root, cq, cb) -> Optional.ofNullable(modifiedBys)
                .filter(CollectionUtils::isNotEmpty)
                .map(root.get(Auditable_.modifiedBy)::in)
                .orElse(null);
    }

}
