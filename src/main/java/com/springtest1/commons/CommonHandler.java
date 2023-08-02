package com.springtest1.commons;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 19:22
 */
@Component
public class CommonHandler implements BeanPostProcessor {

    //一个bean构造之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CommonHandler的postProcessBeforeInitialization");
        return bean;
    }
    //一个bean构造之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CommonHandler的postProcessAfterInitialization");
        return bean;
    }
}
