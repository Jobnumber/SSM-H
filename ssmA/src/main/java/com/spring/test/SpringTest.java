package com.spring.test;

import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ Description   :  测试类，测试框架搭建
 * @ Author        :  1910959369@qq.com
 */

public class SpringTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.findAllUser();
    }
}
