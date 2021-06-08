package com.wzw.test;

import com.wzw.entity.Classes;
import com.wzw.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di.xml");
        //    String[] names = applicationContext.getBeanDefinitionNames();
        //    for (String name : names) {
        //      System.out.println(name);
        //    }
        Classes classes = (Classes) applicationContext.getBean("classes");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(classes);
        System.out.println(student);
    }
}
