package com.spring.test4_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 15:42
 */
@Service  //业务层的类
public class ProductBizImpl implements ProductBiz{

    public ProductBizImpl() {
        System.out.println("ProductBizImpl构造了");
    }

    @Autowired //由spring自动的从容器取出productDao的一个实现类,注入
    private ProductDao productDao; //业务层依赖dao层接口

    @Override
    public void takein() {
        productDao.find();
        int i = 1;
        if(i==1){
            productDao.update();
        }else {
            productDao.add();
        }
    }
}
