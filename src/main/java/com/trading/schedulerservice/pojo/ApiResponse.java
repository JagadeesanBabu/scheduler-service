package com.trading.schedulerservice.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ApiResponse {
    private BigDecimal close;
    private BigDecimal high;
    private Date lastTradeTime;
    private BigDecimal low;
    private BigDecimal open;
    private Integer openInterest;
    private Integer quotationLot;
    private Integer tradeQty;
}
