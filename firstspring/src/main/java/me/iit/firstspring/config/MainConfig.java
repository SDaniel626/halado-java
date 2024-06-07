package me.iit.firstspring.config;

import hu.me.inf.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    Calculator calculator(){
        return null;
    }
}
