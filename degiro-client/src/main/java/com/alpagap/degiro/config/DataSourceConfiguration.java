package com.alpagap.degiro.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(Profiles.CLOUD)
public class DataSourceConfiguration {

//  @Bean
//  public Cloud cloud() {
//    return new CloudFactory().getCloud();
//  }
//
//  @Bean
//  @ConfigurationProperties(DataSourceProperties.PREFIX)
//  public DataSource dataSource() {
//    return cloud().getSingletonServiceConnector(DataSource.class, null);
//  }

}
