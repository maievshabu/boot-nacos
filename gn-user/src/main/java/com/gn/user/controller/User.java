package com.gn.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RefreshScope
public class User {

    @Value(value="${user.name}")
    public String name;

    @Value(value="${user.id:0}")
    public Integer id;

    @RequestMapping("user")
    public String user()
    {
        return name;
    }

    @RequestMapping("id")
    public Integer getId()
    {
        return id;
    }
}
