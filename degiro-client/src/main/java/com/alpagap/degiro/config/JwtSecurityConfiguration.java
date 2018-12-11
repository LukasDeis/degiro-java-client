package com.alpagap.degiro.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ConditionalOnProperty(value = "rabobank.scma.sec.jwt.enabled", havingValue = "true")
public class JwtSecurityConfiguration {

    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter() {
        return new JwtAuthenticationTokenFilter();
    }

    @Bean
    @Qualifier("jwt")
    @Primary
    public JwtUserDetailsServiceImpl jwtUserDetailsServiceImpl() {
        return new JwtUserDetailsServiceImpl();
    }

}
