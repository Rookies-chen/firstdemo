package com.comfirstdemo.dao;

import com.comfirstdemo.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hp
 */
//@Mapper   //将该接口实体注入容器管理
@Repository   //将该接口实体注入容器管理
public interface UserDao {

    //@Select("select * from user where id=#{id}")
    /**
     * 根据id查询
     * @param id
     * @return user
     */
    User queryUserById(Integer id);

    //@Select("select * from user")
    /**
     * 查询所有用户
     * @return List<User>
     */
    List<User> queryAllUser();

    //@Insert("insert into user (name,password,email,address) values(#{name},#{password},#{email},#{address})")
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    //@Delete("delete from user where id = #{id}")
    /**
     * 根据用户id删除
     * @param id
     */
    void deleteUserById(Integer id);

    //@Update("update user set name=#{name},password=#{password},email=#{email},address=#{address} where id = #{id}")
    /**
     * 更新用户信息
     * @param user
     */
    void updateUser(User user);
}
