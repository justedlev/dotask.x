package io.justedlev.dotaskx.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@Accessors(chain = true, fluent = true)
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaskRequest implements Serializable {
    private String name;
    private String command;
}
