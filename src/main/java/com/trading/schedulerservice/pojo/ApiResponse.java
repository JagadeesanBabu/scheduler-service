package com.trading.schedulerservice.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class ApiResponse {
    @JsonProperty("OHLC")
    List<PriceDetails> priceDetails;
}
