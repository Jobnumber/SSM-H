package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.domain.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Description   :  业务层接口实现类
 * @ Author        :  1910959369@qq.com
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        System.out.println("业务层添加方法已经被调用");
        userDao.saveUser(user);
    }

    @Override
    public List<User> findAllUser() {
        System.out.println("业务层添加查询已经被调用");
        return userDao.findAllUser();
    }
}
