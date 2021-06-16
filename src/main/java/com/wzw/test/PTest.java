package com.wzw.test;

import com.wzw.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei @Date 2021/6/9
 */
public class PTest {
    public static void main(String[] args) {
        //
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-p.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
