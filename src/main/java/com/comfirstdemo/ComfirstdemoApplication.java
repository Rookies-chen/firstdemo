package com.comfirstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hp
 */
@SpringBootApplication(scanBasePackages = "com")
//@ComponentScan(basePackages = {"com.comfirstdemo.dao"})
public class ComfirstdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComfirstdemoApplication.class, args);
    }

}
