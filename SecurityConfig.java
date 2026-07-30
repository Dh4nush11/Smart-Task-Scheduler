package com.dhanush.scheduler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public String securityBean(){

        return "Security Disabled For Demo";

    }

}
