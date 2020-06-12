package com.spring.service;

import com.spring.domain.User;

import java.util.List;

/**
 * @ Description   :  业务层接口
 * @ Author        :  1910959369@qq.com
 */

public interface UserService {
    //添加数据
    public void saveUser(User user);
    //查询所有的数据
    public List<User> findAllUser();
}
