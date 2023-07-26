package com.spring.test4_annotation;

import org.springframework.stereotype.Repository;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 15:30
 */
@Repository  //表明这个类beispring托管,这个类是一个dao层的类 --》spring会将异常转为RuntimeException
public class ProductMybatisDaoImpl implements ProductDao{

    public ProductMybatisDaoImpl() {
        System.out.println("ProductMybatisDaoImpl构造了");
    }

    @Override
    public void add() {
        System.out.println("ProductMybatisDaoImpl的add()");
    }

    @Override
    public void find() {
        System.out.println("ProductMybatisDaoImpl的find()");
    }

    @Override
    public void update() {
        System.out.println("ProductMybatisDaoImpl的update()");
    }
}
