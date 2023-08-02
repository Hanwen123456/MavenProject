package com.yc.cglibproxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 21:24
 */
public class OrderBizImpl {

    public void addOrder(int pid,int num){
        System.out.println("添加订单,添加了:"+pid+",数量为:"+num);
    }

    public void findOrder(){
        System.out.println("查询订单");
    }
}
