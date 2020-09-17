package com.trading.schedulerservice.service;

import com.trading.schedulerservice.entity.TradeData;
import com.trading.schedulerservice.pojo.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TradeDataMapper {

    TradeData toEntity(ApiResponse response);
}
