package com.oahmed.storeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    private final WarehouseService warehouseService;

    public StoreController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping("/hours")
    public String getHours() {
        return "Open until 10pm CST Today";
    }

    @GetMapping("/products")
    public String getProducts() {
        return warehouseService.getStock();
    }
}
