package com.yc.staticproxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 19:02
 */
public class Test {

    public static void main(String[] args) {
        OrderBiz ob = new StaticProxy(new OrderBizImpl());
        ob.addOrder(1,100);
    }
}
