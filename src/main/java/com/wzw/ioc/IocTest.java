package com.wzw.ioc;

import org.springframework.context.ApplicationContext;

/**
 * @author wei
 * @Date 2021/6/14
 */
public class IocTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new MyClassPathXmlApplicationContext("spring-ioc.xml");
        Object car = applicationContext.getBean("car");
        System.out.println(car.toString());

    }
}
