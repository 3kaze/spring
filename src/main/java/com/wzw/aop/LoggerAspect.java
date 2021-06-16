package com.wzw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author wei
 * @Date 2021/6/16
 */
//AOP 的概念：
//        切⾯对象：根据切⾯抽象出来的对象，CalImpl 所有⽅法中需要加⼊⽇志的部分，抽象成⼀个切⾯
//        类 LoggerAspect。
//        通知：切⾯对象具体执⾏的代码，即⾮业务代码，LoggerAspect 对象打印⽇志的代码。
//        ⽬标：被横切的对象，即 CalImpl，将通知加⼊其中。
//        代理：切⾯对象、通知、⽬标混合之后的结果，即我们使⽤ JDK 动态代理机制创建的对象。
//        连接点：需要被横切的位置，即通知要插⼊业务代码的具体位置。
@Component
@Aspect
public class LoggerAspect {

    @Before("execution(public int com.wzw.aop.impl.CalImpl.add(..))")
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"方法的参数是"+args);
    }

    @After("execution(public int com.wzw.aop.impl.CalImpl.*(..))")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行完毕");
    }

    @AfterReturning(value = "execution(public int com.wzw.aop.impl.CalImpl.*(..))", returning = "result")
    public void afterReturn(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果是"+result);
    }

    @AfterThrowing(value = "execution(public int com.wzw.aop.impl.CalImpl.*(..))", throwing = "ex")
    public void afterThrow(JoinPoint joinPoint, Exception ex) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法抛出异常"+ex);
    }
}
