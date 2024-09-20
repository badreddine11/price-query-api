package com.bcnc.pricequeryapi.infrastructure.web;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bcnc.pricequeryapi.application.PriceService;
import com.bcnc.pricequeryapi.domain.Price;

@RestController
@RequestMapping("/api/prices")
public class PriceController
{

    private final PriceService priceService;

    public PriceController(PriceService priceService)
    {
        this.priceService = priceService;
    }

    @GetMapping
    public PriceResponse getPrice(@RequestParam("date") String date,
        @RequestParam("productId") Long productId,
        @RequestParam("brandId") Long brandId)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime applicationDate = LocalDateTime.parse(date, formatter);

        Optional<Price> price = priceService.getApplicablePrice(brandId, productId, applicationDate);
        return price.map(PriceResponse::fromPrice).orElse(null);
    }
}

