package com.yc.biz;

import org.springframework.stereotype.Service;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-02 14:33
 */
@Service
public class AccountBizImpl implements AccountBiz{
    @Override
    public void addAccount(int accountid, double money) {
        System.out.println("添加账户..."+accountid);
    }
}
