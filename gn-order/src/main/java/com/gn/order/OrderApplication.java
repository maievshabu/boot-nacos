package com.gn.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = "com.gn")
@SpringBootApplication
@ComponentScan(basePackages = "com.gn")
public class OrderApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(OrderApplication.class, args);
    }
}
