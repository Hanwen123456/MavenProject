package com.yc.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-29 16:01
 */
//@Component
//@Aspect
public class HelloWorldAspect {

    //切入点表达式
    @Pointcut("execution(* com.yc.service..add*(..))")
    private void abc(){
    }

    //下面的方法是一个要加入的增强功能的方法,他会被加入到abc()的注解指定的位置
    @Before("abc()")
    public void doAccessCheck(JoinPoint joinPoint){
        System.out.println("连接点的信息如下:");
        System.out.println("目标类:"+joinPoint.getTarget()+",方法的签名:"+joinPoint.getSignature());
        System.out.println("加了增强的方法中的参数值:");
        Object[] objs = joinPoint.getArgs();
        for(Object obj : objs){
            if(objs!=null || objs.length>0){
                System.out.println(obj);
            }
        }


    }
}
