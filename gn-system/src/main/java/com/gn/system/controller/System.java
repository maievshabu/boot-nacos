package com.gn.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("system")
public class System {

    @Autowired
    private RestTemplate restTemplate;

//    @RequestMapping("user")
//    public String User()
//    {
//        String url = "http://localhost:8876/user/user";
//        String result = restTemplate.getForObject(url, String.class);
//
//        return result;
//    }
//
//    @RequestMapping("order")
//    public String Order()
//    {
//        String url = "http://localhost:8877/order/order";
//        String result = restTemplate.getForObject(url, String.class);
//
//        return result;
//    }
}
