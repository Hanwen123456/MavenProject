package com.yc.biz;

import com.yc.bean.Account;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-02 14:29
 */
public interface AccountBiz {

    /**银行开户**/
    public Account openAccount(double money);

    public Account deposite(int accountid,double money);

    /**存款:给accountid存入money,并返回最后的余额信息**/
    Account deposite(int accountid,double money,Integer transferId);

    public Account withdraw(int accountid,double money);

    /**取款:给accountid取出money,并返回最后的余额信息****/
    public Account withdraw(int accountid,double money,Integer transferId);

    /**从accountid中转出money到toAccountid账户**/
    public Account transfer(int accountId,double money,int toAccountId);

    /**查询是否存在accountId账户**/
    public Account findAccount(int accountId);

}
