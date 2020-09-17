package com.trading.schedulerservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "yahoo.api")
@Data
public class ApiConfig {
    private String baseUrl;
    private String acesskey;
}
