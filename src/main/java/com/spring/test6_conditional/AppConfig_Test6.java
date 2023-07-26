package com.spring.test6_conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 18:55
 */
@Configuration
@ComponentScan(basePackages = {"com.spring.test6_conditional"})
public class AppConfig_Test6 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig_Test6.class);
        String []names = ac.getBeanDefinitionNames();
        for(String n:names){
            System.out.println(n);
        }
    }
}
