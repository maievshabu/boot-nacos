package com.gn.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.gn.feign"})
public class SystemApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SystemApplication.class, args);
    }
}
