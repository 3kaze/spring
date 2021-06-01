package com.wzw.test;

import com.wzw.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author wei */
public class Test {
  public static void main(String[] args) {
    // a. 传统开发方式，手动创建对象
    //    Student student = new Student();
    //    System.out.println(student);

    // b. Ioc容器自动创建对象，开发者只需取出对象
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    // b.1 通过id取值
    Student student = (Student) applicationContext.getBean("student3");
    // b.2 通过类型取值（存在两个或以上Student Bean时会跑异常）
    //    Student student = (Student) applicationContext.getBean(Student.class);
    System.out.println(student);
  }
}
