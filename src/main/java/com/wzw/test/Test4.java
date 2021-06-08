package com.wzw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei @Date 2021/6/9
 */
public class Test4 {
    public static void main(String[] args) {
        //
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-deponds.xml");
    }
}
