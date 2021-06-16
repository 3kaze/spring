package com.wzw.test;

import com.wzw.entity.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei @Date 2021/6/9
 */
public class PropertiesTest {
    public static void main(String[] args) {
        //
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-properties.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
}
