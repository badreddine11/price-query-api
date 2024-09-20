package com.bcnc.pricequeryapi.application;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bcnc.pricequeryapi.domain.Price;
import com.bcnc.pricequeryapi.domain.PriceRepository;

@Service
public class PriceService
{
    private final PriceRepository priceRepository;

    public PriceService(PriceRepository priceRepository)
    {
        this.priceRepository = priceRepository;
    }

    public Optional<Price> getApplicablePrice(Long brandId, Long productId, LocalDateTime applicationDate)
    {
        return priceRepository.findApplicablePrice(brandId, productId, applicationDate);
    }
}

