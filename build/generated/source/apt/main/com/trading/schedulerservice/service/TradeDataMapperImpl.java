package com.trading.schedulerservice.service;

import com.trading.schedulerservice.entity.TradeData;
import com.trading.schedulerservice.pojo.PriceDetails;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-18T17:10:27+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class TradeDataMapperImpl implements TradeDataMapper {

    @Override
    public TradeData toEntity(PriceDetails priceDetails) {
        if ( priceDetails == null ) {
            return null;
        }

        TradeData tradeData = new TradeData();

        tradeData.setHigh( getPrice( priceDetails.getHigh() ) );
        tradeData.setLow( getPrice( priceDetails.getLow() ) );
        tradeData.setLastTradeTime( getLocalDateTime( priceDetails ) );
        tradeData.setClose( getPrice( priceDetails.getClose() ) );
        tradeData.setOpen( getPrice( priceDetails.getOpen() ) );
        tradeData.setOpenInterest( priceDetails.getOpenInterest() );
        tradeData.setQuotationLot( priceDetails.getQuotationLot() );
        tradeData.setTradeQty( priceDetails.getTradeQty() );

        tradeData.setId( java.util.UUID.randomUUID() );

        return tradeData;
    }

    @Override
    public List<TradeData> toEntityList(List<PriceDetails> priceDetails) {
        if ( priceDetails == null ) {
            return null;
        }

        List<TradeData> list = new ArrayList<TradeData>( priceDetails.size() );
        for ( PriceDetails priceDetails1 : priceDetails ) {
            list.add( toEntity( priceDetails1 ) );
        }

        return list;
    }
}
