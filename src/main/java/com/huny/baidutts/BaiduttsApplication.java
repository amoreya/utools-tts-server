package com.huny.baidutts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huny.baidutts.dao")
public class BaiduttsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaiduttsApplication.class, args);
    }

}
