package com.trading.schedulerservice.service;

import com.trading.schedulerservice.api.ApiCallService;
import com.trading.schedulerservice.entity.TradeData;
import com.trading.schedulerservice.repository.TradeDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Scheduler {
    private final ApiCallService apiCallService;
    private final TradeDataRepository repository;
    private final TradeDataMapper mapper;

    @Scheduled(fixedDelay = 1000)
    public void saveTradeDataTask() {
        TradeData tradeData = mapper.toEntity(apiCallService.call());
        log.info("Saving trade data {} ", tradeData );
        repository.save(tradeData);
    }

}
