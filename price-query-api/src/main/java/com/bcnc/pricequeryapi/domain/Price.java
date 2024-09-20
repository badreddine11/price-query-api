package com.bcnc.pricequeryapi.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Price
{
    private Long brandId;

    private Long priceList;

    private Long productId;

    private int priority;

    private BigDecimal price;

    private String currency;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    public Long getBrandId()
    {
        return brandId;
    }

    public void setBrandId(Long brandId)
    {
        this.brandId = brandId;
    }

    public Long getPriceList()
    {
        return priceList;
    }

    public void setPriceList(Long priceList)
    {
        this.priceList = priceList;
    }

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId(Long productId)
    {
        this.productId = productId;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public LocalDateTime getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate)
    {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate()
    {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate)
    {
        this.endDate = endDate;
    }

}

