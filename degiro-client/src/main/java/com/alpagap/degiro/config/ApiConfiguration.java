package com.alpagap.degiro.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("nl.rabobank.scma.api")
@Import({
        DataSourceConfiguration.class,
        WebConfiguration.class, WebSecurityConfiguration.class, SwaggerConfiguration.class})
public class ApiConfiguration {

}


