package com.spring.test4_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 15:53
 */
public class TestMain {

    public static void main(String[] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductBiz pb = (ProductBiz) ac.getBean("productBizImpl");  //beanid:类名首字母小写
        pb.takein();


    }
}
