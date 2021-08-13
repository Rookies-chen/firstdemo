package com.comfirstdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author hp
 */
@MapperScan("com.comfirstdemo.dao")  //扫描dao层文件路径
@SpringBootApplication(scanBasePackages = "com")
//@ComponentScan(basePackages = {"com.comfirstdemo.dao"})
public class ComfirstdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComfirstdemoApplication.class, args);
    }

}
