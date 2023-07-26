package com.spring.test5_import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 16:17
 */
public class TestMain {

    public static void main(String []args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        String []names = ac.getBeanDefinitionNames();
        for(String n: names){
            System.out.println(n);
        }
        Banana b = (Banana) ac.getBean(Banana.class);
        System.out.println(b);
    }


}
