package io.justedlev.dotaskx.configuration;

import io.justedlev.dotaskx.component.AuthAuditorAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditingConfiguration {

    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuthAuditorAware();
    }

}
