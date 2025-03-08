package com.gn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="gn-user")
public interface UserFeign {

    @RequestMapping("user/user")
    String getUser();
}
