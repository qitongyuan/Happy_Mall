package com.qty.Controller;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RefreshScope
@EnableSwaggerBootstrapUI
@EnableSwagger2
@Api(value = "订单模块的测试类",tags = "订单")
@RestController
public class testController {

    @Value("${qty:456}")
    private String name;

    @ApiOperation(value = "测试配置文件读数")
    @GetMapping("/test")
    public String test(){
        return name;
    }

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message")String message){
        return "hello "+message;
    }
}
