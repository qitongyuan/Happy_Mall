package com.qty.FeignCliemt;

import com.qty.FeignCliemt.FallBack.OrderClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "Order",fallback = OrderClientFallBack.class)
public interface OrderClient {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message")String message);
}
