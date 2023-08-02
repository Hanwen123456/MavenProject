package com.yc.staticproxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 18:59
 */
public class StaticProxy implements OrderBiz {
    //目标类的引用,利用setXXX,或构造方法注入
    private OrderBiz orderBiz;

    public StaticProxy(OrderBiz orderBiz) {
        this.orderBiz = orderBiz;
    }

    @Override
    public void addOrder(int pid, int num) {
        //前置增强
        showHello();
        this.orderBiz.addOrder(pid,num);
        //后置增强
        showBye();
    }
    //增强
    public void showHello(){
        System.out.println("hello");
    }
    //增强
    public void showBye(){
        System.out.println("bye");
    }
}
