package com.trading.schedulerservice.service;

import com.trading.schedulerservice.entity.TradeData;
import com.trading.schedulerservice.pojo.ApiResponse;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-18T00:00:27+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class TradeDataMapperImpl implements TradeDataMapper {

    @Override
    public TradeData toEntity(ApiResponse response) {
        if ( response == null ) {
            return null;
        }

        TradeData tradeData = new TradeData();

        return tradeData;
    }
}
