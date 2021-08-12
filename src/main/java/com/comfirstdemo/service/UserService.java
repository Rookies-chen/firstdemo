package com.comfirstdemo.service;

import com.comfirstdemo.bean.User;

import java.util.List;

/**
 * @author hp
 */
public interface UserService {
    User queryUserById(Integer id);

    /**
     * query
     * @return
     */
    List<User> queryAllUser();
    void addUser(User user);
    void deleteUserById(Integer id);
    void updateUser(User user);
}
