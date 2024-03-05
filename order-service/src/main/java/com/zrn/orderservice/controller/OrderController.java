package com.zrn.orderservice.controller;

import com.zrn.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zaroyan
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        return "Заказ размещен успешно";
    }
}
