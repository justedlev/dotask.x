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
public final class RoleGrantedAuthority implements GrantedAuthority {
    private static final String PREFIX = "ROLE_";

    private String authority;

    @Override
    public String getAuthority() {
        return PREFIX + authority;
    }
}
