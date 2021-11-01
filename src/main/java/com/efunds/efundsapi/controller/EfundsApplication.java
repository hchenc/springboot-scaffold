package com.efunds.efundsapi.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EfundsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EfundsApplication.class);
    }

    @GetMapping("/")
    String home(){
        return "Hello Efunds";
    }

    public static void main(String[] args) {
        SpringApplication.run(EfundsApplication.class, args);
    }
}
