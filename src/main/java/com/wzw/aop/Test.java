package com.wzw.aop;

import com.wzw.aop.impl.CalImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei
 * @Date 2021/6/15
 */
public class Test {
    public static void main(String[] args) {
//        实例化委托对象
//        Cal cal = new CalImpl();
//        获取代理对象
//        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
//        Cal proxy = (Cal) myInvocationHandler.bind(cal);
//        proxy.add(3, 4);
//        proxy.sub(3, 4);
//        proxy.mul(3, 4);
//        proxy.div(3, 4);

//        cal.add(10, 3);
//        cal.sub(10, 3);
//        cal.mul(10, 3);
//        cal.div(10, 3);

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-aop.xml");
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        cal.add(10, 3);
        cal.div(10, 0);
    }
}
