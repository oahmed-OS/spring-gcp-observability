package com.oahmed.storeservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class WarehouseService {

    private final RestClient warehouseClient;

    public WarehouseService(RestClient warehouseClient) {
        this.warehouseClient = warehouseClient;
    }

    public String getStock() {
        return warehouseClient.get()
                .uri("/stock")
                .retrieve()
                .body(String.class);
    }
}
