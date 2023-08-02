package com.yc.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-29 20:51
 */
@Component
@Aspect
@Order(10)
public class TestAspect {
    //切入点表达式
    @Pointcut("execution(* com.yc.service..add*(..))")
    private void abc(){

    }

//    @AfterReturning(pointcut="abc()",returning = "retVal")
//    public void show(Object retVal){
//        System.out.println("returning,被增强方法的返回值为:"+retVal);
//    }

//    @AfterThrowing(pointcut="abc()",throwing = "e")
//    public void show2(RuntimeException e){
//        System.out.println("AfterThrowing,被增强的方法有异常抛出:"+e);
//    }

//    @After("abc()")
//    public void show3(){
//        System.out.println("After,只要方法执行完即可,不管正常或异常");
//    }

//    @Around("abc()")
//    public Object show4(ProceedingJoinPoint pjp) throws Throwable {  //ProceedingJoinPoint代表连接点
//        System.out.println("在原方法前的代码");
//
//        Object obj = pjp.proceed();
//
//        System.out.println("在原方法后的代码");
//
//        return obj;
//    }

    @Around("abc()")
    public Object show5(ProceedingJoinPoint pjp) throws Throwable {  //ProceedingJoinPoint代表连接点
        System.out.println("在原方法前的代码");

        Object obj = pjp.proceed();

        System.out.println("在原方法后的代码");

        return obj;
    }

}
