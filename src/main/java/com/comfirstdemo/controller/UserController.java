package com.comfirstdemo.controller;

import com.comfirstdemo.bean.User;
import com.comfirstdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hp
 */
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping ("/allUser")
    @ResponseBody
    public List<User> queryAllUser(){
        List<User> list = userService.queryAllUser();
        return list;
    }
    @GetMapping("/addUser")
    @ResponseBody   //没有此注解时就是业务成功，浏览器上也显示500，该注解的作用是将请求结果返回浏览器
    /**
     * @RequestBody：前端请求-->后端json数据格式（postman调试传对象参数时也必须有该注解）
     */
    public void addUser(@RequestBody User user){
        /*user.setId(3);
        user.setName("嫦娥2号");
        user.setPassword("1234");
        user.setEmail("2345@qq.com");
        user.setAddress("月亮");*/
        userService.addUser(user);
        System.out.println("添加成功");
    }

    @GetMapping("/queryUserById")
    @ResponseBody
    public User queryUserById(Integer id){
        User user = userService.queryUserById(id);
        return user;
    }

    @GetMapping("/deleteUser")
    @ResponseBody
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }

    @GetMapping("/updateUser")
    @ResponseBody
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
