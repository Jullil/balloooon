package com.github.jullil.balloooon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * @author jul
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.github.jullil.balloooon.web", "com.github.jullil.balloooon.service", "com.github.jullil.balloooon.repository"})
@Import(WebSecurityConfig.class)
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver() {
        final UrlBasedViewResolver url = new UrlBasedViewResolver();
        url.setPrefix("/WEB-INF/view/");
        url.setViewClass(JstlView.class);
        url.setSuffix(".jsp");
        return url;
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        final ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/META-INF/resources/css/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }
}
