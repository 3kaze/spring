package com.wzw.test;

import com.wzw.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei @Date 2021/6/7
 */
public class Test3 {
    public static void main(String[] args) {
        //
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1 = (User) applicationContext.getBean("user");
        User user2 = (User) applicationContext.getBean("user1");
        System.out.println(user1 == user2);
        System.out.println(user1);
        System.out.println(user2);
    }
}
