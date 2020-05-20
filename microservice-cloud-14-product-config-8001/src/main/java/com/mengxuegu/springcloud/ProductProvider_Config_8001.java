package com.mengxuegu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.mengxuegu.springcloud.mapper")
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@SpringBootApplication
public class ProductProvider_Config_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class,args);
    }

}
