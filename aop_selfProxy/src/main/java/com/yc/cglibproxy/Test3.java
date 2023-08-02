package com.yc.cglibproxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 21:24
 */
public class Test3 {

    public static void main(String[] args) {
        CglibProxyTool jpt = new CglibProxyTool(new OrderBizImpl());
        OrderBizImpl ob = (OrderBizImpl) jpt.createProxy();
        System.out.println("生成代理对象:"+ob.toString());

        ob.findOrder();
        ob.addOrder(1,88);

    }
}
