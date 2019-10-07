package com.qty.FeignCliemt.FallBack;

import com.qty.FeignCliemt.OrderClient;
import org.springframework.stereotype.Component;

@Component
public class OrderClientFallBack implements OrderClient {
    @Override
    public String echo(String message) {
        return "服务挂掉了";
    }
}
