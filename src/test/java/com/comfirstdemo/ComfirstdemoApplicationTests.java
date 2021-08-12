package com.comfirstdemo;

import com.comfirstdemo.bean.User;
import com.comfirstdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/*//@RunWith(SpringRunner.class)
@SpringBootTest
public class ComfirstdemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void queryAllUser(){

    }

    @Test
    void queryUserById(Integer id){
        id = 2;
        User user = userService.queryUserById(id);
        System.out.println(user);;
    }

}*/
