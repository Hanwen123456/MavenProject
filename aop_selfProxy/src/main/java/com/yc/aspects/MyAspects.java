package com.yc.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 09:16
 */
@Aspect
@Component
public class MyAspects {

    //切入点表达式
    @Pointcut("execution(* com.yc.biz.*.make*(..))")
    private void a(){}

    @Before("a()")
    public void recordTime(){
        Date date = new Date();
        System.out.println("下单时间:"+date);
    }

    @AfterReturning("a()")
    public void sendEmail(){
        System.out.println("调用数据库查询此下单用户的email,包括信息,发送消息中间件");
    }

    @AfterReturning("a()")
    public void recordParams(JoinPoint point){
        System.out.println("增强的方法:"+point.getSignature());
        System.out.println("增强的目标类:"+point.getTarget());
        System.out.println("参数:");
        Object[] params = point.getArgs();
        for(Object param : params){
            System.out.println(param);
        }
    }

    //切入点表达式
    @Pointcut("execution(* com.yc.biz.*.findOrderId(String))")
    private void b(){}

    //TODO:正常是要访问redis
    private Map<String,Long> map = new ConcurrentHashMap<String,Long>();
    //统计每个商品被查询的次数
    @AfterReturning("b()")
    public void recordPnameCount(JoinPoint jp){
        Object[] objs = jp.getArgs();
        String pname = (String) objs[0];
        Long num = 1L;
        if(map.get(pname)!=null){
            num = map.get(pname);
            num++;
            map.put(pname,num);
        }else {
            map.put(pname,1L);
        }
        System.out.println("统计结果:"+map);
    }

    //切入点表达式
    @Pointcut("execution(* com.yc.biz.*.findPid(String))")
    private void c(){}

    private Map<String,Long> map2 = new ConcurrentHashMap<String,Long>();
    //统计每个商品被查询的次数
    @AfterReturning(value = "c()",returning = "reValue")
    public void recordPnameCount2(JoinPoint jp,int reValue){
        Object[] objs = jp.getArgs();
        String pname = (String) objs[0];
        Long num = 1L;
        if(map2.get(pname)!=null){
            num = map2.get(pname);
            num++;
        }
        map2.put(pname+reValue,num);
        System.out.println("统计结果:"+map2);
    }

    @AfterThrowing(pointcut = "a()",throwing = "ex")
    public void recordException(JoinPoint jp,RuntimeException ex){  //由spring容器将捕获到的异常传入
        System.out.println("*********异常了***********");
        System.out.println(ex.getMessage());
        System.out.println(jp.getArgs()[0]+"\t"+jp.getArgs()[1]);
        System.out.println("*******************");
    }

    @Pointcut("execution(* com.yc.biz.*.find*(..))")
    private void d(){}

    @Around("d()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed(); //返回值 find*()
        long end = System.currentTimeMillis();
        System.out.println("方法执行时间:"+(end-start));
        return obj;
    }



}
