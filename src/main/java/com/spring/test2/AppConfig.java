package com.spring.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-25 20:53
 */
@Configuration          //此注释  表示这个类是一个配置类，相当于 beans.xml文件
public class AppConfig {

    @Bean
    public Apple a(){   //<bean id="a" class="com.spring.test2.Apple">
         Apple a = new Apple();
         a.setId(100);
         return a;
    }
    // a对象以 a作为键名存到ApplicationContext容器

    @Bean
    public ThreadPoolExecutor tpe(){
        int corePoolSize = Runtime.getRuntime().availableProcessors();
        //核心线程池的最大线程数
        int maxPoolSize = corePoolSize * 2;
        //线程最大空闲时间
        long keepAlive = 10;
        //时间单位
        TimeUnit unit = TimeUnit.SECONDS;  //enum枚举 常量
        //阻塞队列 容量为2 最多允许放入两个空闲任务
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(maxPoolSize*4);
        //
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize,maxPoolSize,keepAlive,unit,workQueue);
        //预启动所有的核心线程
        executor.prestartAllCoreThreads();
        return executor;

    }


}
