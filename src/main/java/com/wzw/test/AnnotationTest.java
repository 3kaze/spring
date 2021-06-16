package com.wzw.test;

import com.wzw.entity.Repository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei
 * @Date 2021/6/13
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-annotation.xml");
//        Repository repository = (Repository) applicationContext.getBean("repository");
//        System.out.println(repository);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
