package com.github.jullil.balloooon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jul
 */
@Configuration
@ComponentScan(basePackages = {"com.github.jullil.balloooon.service", "com.github.jullil.balloooon.repository"})
@Import({RepositoryConfig.class, MvcConfig.class, SecurityConfig.class})
public class ApplicationConfig {

}
