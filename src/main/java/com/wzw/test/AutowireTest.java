package com.wzw.test;

import com.wzw.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei
 * @Date 2021/6/13
 */
public class AutowireTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("spring-autowire.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
