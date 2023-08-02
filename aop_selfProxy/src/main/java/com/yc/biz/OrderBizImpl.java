package com.yc.biz;

import org.springframework.stereotype.Service;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 09:15
 */
@Service
public class OrderBizImpl implements OrderBiz{

    @Override
    public void makeOrder(int pid,int num){
        if(num>5){
            throw new RuntimeException("库存数量不足");
        }
        System.out.println("makeOrder的方法调用:下订:"+pid+"\t"+num);
    }

    @Override
    public int findOrderId(String pname) {
        System.out.println("findOrderId根据商品名"+pname+"\t查找商品对应的订单号");
        return 1;
    }

    @Override
    public int findPid(String pname) {
        System.out.println("findPid根据商品名:"+pname+"\t查找对应的商品号");
        return (int) (Math.random()*10);
    }


}
