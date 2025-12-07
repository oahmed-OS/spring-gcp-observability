package com.oahmed.storeservice;

import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/store")
public class StoreController {

    private final WarehouseService warehouseService;

    public StoreController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @Timed
    @GetMapping("/hours")
    public String getHours() {
        log.info("Getting hours");
        return "Open until 10pm CST Today";
    }

    @GetMapping("/products")
    public String getProducts() {
        MDC.put("user", UUID.randomUUID().toString());
        log.info("Getting products");
        return warehouseService.getStock();
    }

    @GetMapping("/warn")
    public void getWarn() {
        log.warn("Warning logged");
    }

    @GetMapping("/error")
    public void getError() {
        log.error("Error logged");
    }
}
