package com.yc;

import com.yc.biz.OrderBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 10:05
 */
public class App {

    public static void main(String[] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        OrderBiz biz = (OrderBiz) ac.getBean("orderBizImpl");
//        biz.makeOrder(1,4);
//        biz.findOrderId("apple");
//        biz.findOrderId("apple");
//        biz.findOrderId("apple");
//        biz.findOrderId("pear");


        biz.findPid("apple");
//        biz.findPid("apple");
//        biz.findPid("apple");
//        biz.findPid("pear");
    }
}
