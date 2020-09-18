package com.trading.schedulerservice.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
public class PriceDetails {
    @JsonProperty("OPENINTEREST")
    private Integer openInterest;
    @JsonProperty("HIGH")
    private Double high;
    @JsonProperty("LOW")
    private Double low;
    @JsonProperty("TRADEDQTY")
    private Integer tradeQty;
    @JsonProperty("CLOSE")
    private Double close;
    @JsonProperty("LASTTRADETIME")
    private Long lastTradeTime;
    @JsonProperty("OPEN")
    private Double open;
    @JsonProperty("QUOTATIONLOT")
    private Integer quotationLot;

}
