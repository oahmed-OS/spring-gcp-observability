package com.oahmed.storeservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
public class WarehouseService {

    private final RestClient warehouseClient;

    public WarehouseService(RestClient warehouseClient) {
        this.warehouseClient = warehouseClient;
    }

    public String getStock() {
        log.debug("Making stock request to Warehouse service");
        String response = warehouseClient.get()
                .uri("/stock")
                .retrieve()
                .body(String.class);

        log.debug("Stock response from Warehouse service: {}", response);
        return response;
    }
}
