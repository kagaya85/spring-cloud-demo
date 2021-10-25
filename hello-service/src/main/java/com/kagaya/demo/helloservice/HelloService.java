package com.kagaya.demo.helloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloService {

    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }

}
