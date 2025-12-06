package com.oahmed.warehouseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @GetMapping("/stock")
    public String stock() {
        return "2 Milk in stock!";
    }
}
