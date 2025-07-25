package io.justedlev.dotaskx.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Accessors(chain = true, fluent = true)
@AllArgsConstructor
@NoArgsConstructor
public abstract class VersionableResponse extends AuditableResponse implements Serializable {
    private Long version;
}
