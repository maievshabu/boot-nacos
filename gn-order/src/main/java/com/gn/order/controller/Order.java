package com.gn.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@RefreshScope
public class Order{

    @Value(value="${order.name}")
    public String name;

    @Value(value="${order.id:0}")
    public Integer id;

    @RequestMapping("order")
    public String order()
    {
        return name;
    }

    @RequestMapping("id")
    public Integer getId()
    {
        return id;
    }
}
