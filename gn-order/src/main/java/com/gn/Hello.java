package com.gn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class Hello {

    @RequestMapping("hello")
    public String hello()
    {
        return "hello";
    }
}
