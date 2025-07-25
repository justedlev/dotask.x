package io.justedlev.dotaskx.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Accessors(chain = true, fluent = true)
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse extends VersionableResponse implements Serializable {
    private UUID id;
    private String name;
    private String command;
}
