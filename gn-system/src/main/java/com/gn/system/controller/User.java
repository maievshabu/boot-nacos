package com.gn.system.controller;

import com.gn.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system")
public class User {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("user")
    public String user()
    {
        return userFeign.getUser();
    }
}
