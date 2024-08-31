package dev.justedlev.restjobx.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicUpdate
@Entity
@Table(schema = "restjobx", name = "job")
public class Job extends Auditable implements Serializable {
    @Id
    @Column(name = "id")
    @UuidGenerator
    @Setter(AccessLevel.PROTECTED)
    private UUID id;
}
