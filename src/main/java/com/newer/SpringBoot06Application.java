package com.newer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.newer.mapper")
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)//开启权限注解
public class SpringBoot06Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06Application.class, args);
    }

}
