package com.trading.schedulerservice.repository;

import com.trading.schedulerservice.entity.TradeData;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TradeDataRepository extends JpaRepository<TradeData, UUID> {

}
