package com.bcnc.pricequeryapi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import com.bcnc.pricequeryapi.infrastructure.web.PriceResponse;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceControllerTest
{

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testPriceRequest1()
    {
        ResponseEntity<PriceResponse> response = restTemplate
            .getForEntity("/api/prices?date=2020-06-14 10:00:00&productId=35455&brandId=1", PriceResponse.class);
        assertThat(response.getBody().getPrice()).isEqualTo("35.50");
    }

    @Test
    public void testPriceRequest2()
    {
        ResponseEntity<PriceResponse> response = restTemplate
            .getForEntity("/api/prices?date=2020-06-14 16:00:00&productId=35455&brandId=1", PriceResponse.class);
        assertThat(response.getBody().getPrice()).isEqualTo("25.45");
    }

    // Add other test cases accordingly...
}
