package com.spring.test3_factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 14:39
 */
public class TestMain {

    public static void main(String []args){
        //1.创建容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfigTest3.class);
        Object obj = ac.getBean("ffb");  //ffb->pear
        System.out.println(obj);
        Object obj1 = ac.getBean("&ffb");  //ffb->pear
        System.out.println(obj1);

        //获取spring容器所有托管的bean
        String [] beanNames = ac.getBeanDefinitionNames();
        for(String bn : beanNames){
            System.out.println(bn);
        }
    }
}
