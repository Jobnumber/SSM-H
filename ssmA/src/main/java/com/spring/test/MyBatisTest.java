package com.spring.test;

import com.spring.dao.UserDao;
import com.spring.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ Description   :  测试类，用于测试MyBatis框架搭建
 * @ Author        :  1910959369@qq.com
 */

public class MyBatisTest {
    @Test
    public void run() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("SqlConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserDao userDao=(UserDao)sqlSession.getMapper(UserDao.class);
        List<User>userList=userDao.findAllUser();
        for (User user:userList){
            System.out.println("user.getName() = " + user.getName());
        }
        sqlSession.close();
        inputStream.close();
    }
}
