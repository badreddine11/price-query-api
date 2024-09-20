package com.bcnc.pricequeryapi.infrastructure.persistence;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prices")
public class PriceEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "price_list")
    private Long priceList;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "priority")
    private int priority;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "curr")
    private String currency;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;
}

