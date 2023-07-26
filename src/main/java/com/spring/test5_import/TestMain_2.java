package com.spring.test5_import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 18:20
 */
public class TestMain_2 {

    public static void main(String []args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig_2.class);
        String []names = ac.getBeanDefinitionNames();
        for(String n: names){
            System.out.println(n);
        }
    }
}
