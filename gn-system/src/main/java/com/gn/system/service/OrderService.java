package com.gn.system.service;

import com.gn.feign.OrderFeign;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderFeign orderFeign;

    public OrderService(OrderFeign orderFeign)
    {
        this.orderFeign = orderFeign;
    }

    public String getOrder()
    {
        return orderFeign.getOrder();
    }
}
