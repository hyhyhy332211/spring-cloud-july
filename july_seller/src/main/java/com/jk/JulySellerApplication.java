package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.jk.seller.mapper")
public class JulySellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JulySellerApplication.class, args);
    }
}
