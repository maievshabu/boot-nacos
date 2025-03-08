package com.gn.system.config;

import com.gn.feign.OrderFeign;
import com.gn.feign.UserFeign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
    @Bean
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
