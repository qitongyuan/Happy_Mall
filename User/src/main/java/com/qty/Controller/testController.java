package com.qty.Controller;

import com.qty.FeignCliemt.OrderClient;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@Api(value = "用户模块的测试类",tags = "用户")
public class testController {

    private OrderClient orderClient;

    @GetMapping("/recevie")
    public String getMessage(){
        return orderClient.echo("嘿嘿");
    }

}
