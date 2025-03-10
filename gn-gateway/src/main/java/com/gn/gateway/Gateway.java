package com.gn.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
@RefreshScope
public class Gateway {

    @Value(value="${name}")
    String name;

    @RequestMapping("get")
    public String get()
    {
        return name;
    }
}
