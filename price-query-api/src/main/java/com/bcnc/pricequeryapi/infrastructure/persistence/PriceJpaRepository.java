package com.bcnc.pricequeryapi.infrastructure.persistence;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bcnc.pricequeryapi.domain.Price;
import com.bcnc.pricequeryapi.domain.PriceRepository;

@Repository
public interface PriceJpaRepository
    extends
    JpaRepository<Price, Long>,
    PriceRepository
{

    @Override
    @Query("SELECT p FROM Price p WHERE p.brandId = :brandId AND p.productId = :productId AND :applicationDate BETWEEN p.startDate AND p.endDate ORDER BY p.priority DESC")
    Optional<Price> findApplicablePrice(Long brandId, Long productId, LocalDateTime applicationDate);
}
