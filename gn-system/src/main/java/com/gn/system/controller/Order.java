package com.gn.system.controller;

import com.gn.feign.OrderFeign;
import com.gn.system.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system")
public class Order {

    @Autowired
    private OrderService orderService;

    @RequestMapping("order")
    public String getOrder() {
        return orderService.getOrder();
    }
}
