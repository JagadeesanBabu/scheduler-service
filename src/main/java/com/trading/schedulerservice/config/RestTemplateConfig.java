package com.trading.schedulerservice.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Component
public class RestTemplateConfig {

    private final RestTemplateBuilder restTemplateBuilder;
    private final ApiConfig apiConfig;

    @Bean
    public final RestTemplate yahooRestTemplate() {
       // http://test.lisuns.com:4531/GetHistory/?accessKey=c0140bb8-018c-444c-a1d9-0ee86d1dd536&exchange=NFO&instrumentIdentifier=BANKNIFTY-I&periodicity=Minute&period=1&max=1
        return restTemplateBuilder
                .rootUri(apiConfig.getBaseUrl())
                .build();
    }
}
