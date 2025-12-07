package com.oahmed.storeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class WarehouseClientConfig {

    private final String baseUrl;

    public WarehouseClientConfig(@Value("${warehouse.baseUrl}") String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Bean
    public RestClient warehouseClient(RestClient.Builder builder) {
        String url = this.baseUrl + "/warehouse";
        return builder
                .baseUrl(url)
                .build();
    }
}
