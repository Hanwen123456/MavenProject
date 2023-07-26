package com.spring.test3_factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @program: MavenProject
 * @description:   水果工厂
 * @author: 作者
 * @create: 2023-07-26 14:36
 */
public class FruitFactoryBean implements FactoryBean {

    public FruitFactoryBean() {
        System.out.println("工厂构造。。。");
    }

    @Override
    public Pear getObject() throws Exception {
        return new Pear();
    }

    @Override
    public Class<?> getObjectType() {
        return Pear.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
