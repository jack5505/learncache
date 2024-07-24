package com.example.learncache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LearnCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnCacheApplication.class, args);
    }

}
