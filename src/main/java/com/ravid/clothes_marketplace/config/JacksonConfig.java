package com.ravid.clothes_marketplace.config;

import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
    @Bean
    JsonNullableModule jsonNullableModule() {
        return new JsonNullableModule();
    }
}