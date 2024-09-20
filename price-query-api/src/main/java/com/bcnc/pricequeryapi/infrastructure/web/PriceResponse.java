package com.bcnc.pricequeryapi.infrastructure.web;

import com.bcnc.pricequeryapi.domain.Price;

import lombok.Data;

@Data
public class PriceResponse
{
    private Long brandId;

    private Long productId;

    private Long priceList;

    private String startDate;

    private String endDate;

    private String price;

    public static PriceResponse fromPrice(Price price)
    {
        PriceResponse response = new PriceResponse();
        response.setBrandId(price.getBrandId());
        response.setProductId(price.getProductId());
        response.setPriceList(price.getPriceList());
        response.setStartDate(price.getStartDate().toString());
        response.setEndDate(price.getEndDate().toString());
        response.setPrice(price.getPrice().toString());
        return response;
    }

    public Long getBrandId()
    {
        return brandId;
    }

    public void setBrandId(Long brandId)
    {
        this.brandId = brandId;
    }

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId(Long productId)
    {
        this.productId = productId;
    }

    public Long getPriceList()
    {
        return priceList;
    }

    public void setPriceList(Long priceList)
    {
        this.priceList = priceList;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

}

