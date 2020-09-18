package com.trading.schedulerservice.service;

import com.trading.schedulerservice.entity.TradeData;
import com.trading.schedulerservice.pojo.PriceDetails;
import org.mapstruct.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Mapper(componentModel = "spring")
public interface TradeDataMapper {

    @Mappings({
            @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())"),
            @Mapping(target = "lastTradeTime", source = "priceDetails", qualifiedByName = "getLocalDateTime()"),
            @Mapping(target = "close", source = "close", qualifiedByName = "getPrice()"),
            @Mapping(target = "open", source = "open", qualifiedByName = "getPrice()"),
            @Mapping(target = "high", source = "open", qualifiedByName = "getPrice()"),
            @Mapping(target = "low", source = "open", qualifiedByName = "getPrice()"),
    })
    TradeData toEntity(PriceDetails priceDetails);

    List<TradeData> toEntityList(List<PriceDetails> priceDetails);

    @Named("getPrice")
    default BigDecimal getPrice(Double price) {
        BigDecimal decimalPrice = new BigDecimal(price);
        decimalPrice.setScale(2, BigDecimal.ROUND_UP);
        return decimalPrice;
    }

    @Named("getLocalDateTime")
    default LocalDateTime getLocalDateTime(PriceDetails priceDetails) {
        return Instant.ofEpochMilli(priceDetails.getLastTradeTime()).atZone(ZoneId.of("Asia/Kolkata")).toLocalDateTime();
    }
}
