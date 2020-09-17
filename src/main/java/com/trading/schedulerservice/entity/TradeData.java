package com.trading.schedulerservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import java.util.UUID;

@Entity(name = "real_time_data")
public class TradeData {
    @Id
    private UUID id;

    private BigDecimal close;
    private BigDecimal high;
    private LocalDateTime lastTradeTime;
    private BigDecimal low;
    private BigDecimal open;
    private Integer openInterest;
    private Integer quotationLot;
    private Integer tradeQty;
}
