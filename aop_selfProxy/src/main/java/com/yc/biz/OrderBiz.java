package com.yc.biz;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 09:15
 */
public interface OrderBiz {

    public void makeOrder(int pid,int num);

    public int findOrderId(String pname);

    public int findPid(String pname);


}
