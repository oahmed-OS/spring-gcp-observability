package com.oahmed.warehouseservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @GetMapping("/stock")
    public String stock() {
        log.info("Getting warehouse stock");
        return "2 Milk in stock!";
    }
}
