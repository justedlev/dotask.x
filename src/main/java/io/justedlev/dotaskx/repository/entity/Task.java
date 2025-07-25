package io.justedlev.dotaskx.repository.entity;

import io.justedlev.commons.Versionable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Audited
@DynamicUpdate
@Entity
@Table(name = "task")
public class Task extends Versionable<UUID> implements Serializable {

    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "command")
    private String command;

//    @NotNull
//    @Column(name = "trigger")
//    private Trigger trigger;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @Cascade({
            CascadeType.DETACH,
            CascadeType.REFRESH,
    })
    @JoinColumn(name = "status_id", updatable = false)
    private Status status;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @Cascade({
            CascadeType.DETACH,
            CascadeType.REFRESH,
    })
    @JoinColumn(name = "mode_id", updatable = false)
    private Mode mode;

}
