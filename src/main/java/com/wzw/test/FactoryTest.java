package com.wzw.test;

import com.wzw.entity.Car;
import com.wzw.factory.InstanceCarFactory;
import com.wzw.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei
 * @Date 2021/6/12
 */
public class FactoryTest {
    public static void main(String[] args) {
//        Car car = StaticCarFactory.getCar(1);
//        System.out.println(car);
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car = (Car) applicationContext.getBean("car1");
        System.out.println(car);

//        //实例化工厂类
//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        //获取Car
//        Car car2 = instanceCarFactory.getCar(1);
//        System.out.println(car2);

        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2);
    }
}
