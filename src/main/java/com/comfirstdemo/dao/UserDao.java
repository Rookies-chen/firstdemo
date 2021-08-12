package com.comfirstdemo.dao;

import com.comfirstdemo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author hp
 */
@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
    User queryUserById(Integer id);

    @Select("select * from user")
    List<User> queryAllUser();

    @Insert("insert into user (name,password,email,address) values(#{name},#{password},#{email},#{address})")
    void addUser(User user);

    @Delete("delete from user where id = #{id}")
    void deleteUserById(Integer id);

    @Update("update user set name=#{name},password=#{password},email=#{email},address=#{address} where id = #{id}")
    void updateUser(User user);
}
