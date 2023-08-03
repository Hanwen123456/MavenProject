package com.yc.dao;

import com.yc.bean.Account;

import java.util.List;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-03 09:45
 */
public interface AccountDao {

    /**
     * 添加Account账号
     * @param money
     * @return   新账号的编号
     */
    public int insert(double money);

    /**
     * 根据账号将money更新
     * @param accountid
     * @param money
     */
    public void update(int accountid,double money);

    /**
     * 删除账号
     * @param accountid
     */
    public void delete(int accountid);

    /**
     * 查询账户总数
     * @return
     */
    public int findCount();

    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 根据id查询账户
     * @param accountid
     * @return
     */
    public Account findById(int accountid);
}
