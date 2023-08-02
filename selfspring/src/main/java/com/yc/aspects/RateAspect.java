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
 * @create: 2023-07-30 10:14
 */
@Component
@Aspect
@Order(20)
public class RateAspect {

    @Pointcut("execution(* com.yc.service..add*(..))")
    private void abc(){}

    @Around("abc()")
    public Object add(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("RateAspect进来了");
        long startTime = System.currentTimeMillis();

        Object obj = pjp.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println("方法运行了:"+(endTime-startTime));

        return obj;

    }


}
