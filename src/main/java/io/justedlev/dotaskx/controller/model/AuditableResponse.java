package io.justedlev.dotaskx.controller.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@Accessors(chain = true, fluent = true)
@AllArgsConstructor
@NoArgsConstructor
public abstract class AuditableResponse implements Serializable {
    private String createdBy;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime createdAt;
    private String modifiedBy;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime modifiedAt;
}
