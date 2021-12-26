package ru.matveykenya.springbootconditionalapp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.matveykenya.springbootconditionalapp.service.DevProfile;
import ru.matveykenya.springbootconditionalapp.service.ProductionProfile;
import ru.matveykenya.springbootconditionalapp.service.SystemProfile;


@Configuration
public class JavaConfig {

    @ConditionalOnProperty(
            value="netology.service.dev",
            havingValue = "true",
            matchIfMissing = true)
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(
            value="netology.service.dev",
            havingValue = "false",
            matchIfMissing = false)
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
