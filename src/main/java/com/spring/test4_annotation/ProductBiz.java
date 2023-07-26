package com.spring.test4_annotation;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 15:37
 */
public interface ProductBiz {


    /**
     * 入库:  1.先查  2.再添加(a.加数量 update() b.添加add())
     */
    public void takein();

}
