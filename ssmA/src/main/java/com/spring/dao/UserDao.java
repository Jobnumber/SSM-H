package com.spring.dao;

import com.spring.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ Description   :  持久层接口
 * @ Author        :  1910959369@qq.com
 */

public interface UserDao {
    //添加数据
    @Insert("insert into user(name,age) values(#{name},#{age})")
    public void saveUser(User user);
    //查询所有的数据
    @Select("select * from user")
    public List<User>findAllUser();
}
