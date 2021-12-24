package ru.matveykenya.springbootconditionalapp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {

    @ConditionalOnProperty(
            value="netology.profile.dev",
            havingValue = "true",
            matchIfMissing = true)
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(
            value="netology.profile.dev",
            havingValue = "false",
            matchIfMissing = false)
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
