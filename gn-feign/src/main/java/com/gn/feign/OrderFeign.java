package com.gn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="gn-order")
public interface OrderFeign {

    @RequestMapping("order/order")
    String getOrder();
}
