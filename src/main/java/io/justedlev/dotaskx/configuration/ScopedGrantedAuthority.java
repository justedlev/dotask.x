package io.justedlev.dotaskx.configuration;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(fluent = true)
@With
public final class ScopedGrantedAuthority implements GrantedAuthority {
    private static final String PREFIX = "SCOPE_";

    private String name;
    private String authority;

    @Override
    public String getAuthority() {
        return PREFIX + name + ":" + authority;
    }
}
