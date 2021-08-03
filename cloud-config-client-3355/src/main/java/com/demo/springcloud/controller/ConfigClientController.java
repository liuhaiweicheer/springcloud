package com.demo.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *  更改配置文件之后需要发送Post 请求到 3355 才能更新最新的配置
 *    CMD 执行命令  ：curl -X POST ”http://localhost:3355/actuator/refresh“
 *
 * @Author: Liu Haiwei
 * @Date: 2021/8/3 23:36
 * @Description:
 */


@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }

}
