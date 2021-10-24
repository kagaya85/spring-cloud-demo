package com.kagaya.demo.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceA {

    public static void main(String[] args) {
        SpringApplication.run(ServiceA.class, args);
    }

}
