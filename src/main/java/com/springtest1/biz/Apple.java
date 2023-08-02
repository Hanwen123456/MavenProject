package com.springtest1.biz;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 18:59
 */
@Component
public class Apple implements InitializingBean, DisposableBean {

    public Apple(){
        System.out.println("apple的构造方法");
    }

//    @PostConstruct
//    public void init(){
//
//    }
//
//    @PreDestroy
//    public void destroy(){
//
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("apple的init()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("apple的destroy()");
    }
}
