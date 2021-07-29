package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Liu Haiwei
 * <p>
 * Date 2021-07-29
 */
@EnableHystrixDashboard
@SpringBootApplication
public class OrderHystrixDashboard9001 {
    public static void main(String[] args){
        SpringApplication.run(OrderHystrixDashboard9001.class, args);
    }
}
