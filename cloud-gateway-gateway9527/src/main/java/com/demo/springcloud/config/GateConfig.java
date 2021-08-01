package com.demo.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Liu Haiwei
 * @Date: 2021/8/1 22:55
 * @Description:
 */

@Configuration
public class GateConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_demo", r -> r.path("/text").uri("http://news.baidu.com.guonei")).build();
        return routes.build();
    }

}
