package org.springframework.samples.petclinic.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Spring Framework 6 no longer matches "/api/owners/" to "/api/owners" by default.
 * Keeps the trailing slash matching that the API had with Spring Boot 2.6.
 */
@Configuration
public class TrailingSlashMatchConfig implements WebMvcConfigurer {

    @Override
    @SuppressWarnings("deprecation")
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseTrailingSlashMatch(true);
    }
}
