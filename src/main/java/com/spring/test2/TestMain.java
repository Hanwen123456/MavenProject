package com.spring.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-25 21:24
 */
public class TestMain {
    public static void main(String []args){
        // AnnotationConfig ApplicationContext 基于注解@Configuration的配置类
        //IOC完成,DI完成
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        ThreadPoolExecutor tpe = (ThreadPoolExecutor) ac.getBean("tpe");
        tpe.submit(()->{
            System.out.println("hello");
        });


    }
}
