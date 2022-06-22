package com.wzz.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

    public static void main(String[] args) {
        System.out.println("local test!");
        SpringApplication.run(TestProjectApplication.class, args);
    }

}
