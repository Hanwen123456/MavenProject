package com.yc.staticproxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 18:57
 */
public class OrderBizImpl implements OrderBiz{

    @Override
    public void addOrder(int pid, int num) {
        System.out.println("添加订单,添加了:"+pid+",数量为:"+num);
    }
}
