package com.yc.biz;

import com.yc.bean.Account;
import com.yc.bean.OpRecord;
import com.yc.bean.OpType;
import com.yc.dao.AccountDao;
import com.yc.dao.OpRecordDao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-02 14:33
 */
@Service
@Log4j2
@Transactional
public class AccountBizImpl implements AccountBiz{
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private OpRecordDao opRecordDao;

    //spring对异常处理
    //正常的程序异常

    @Override
    public Account openAccount(double money) {
        //开户操作,返回新账号的id
        int accountid = this.accountDao.insert(money);
        //包装日志信息
        OpRecord opRecord = new OpRecord();
        opRecord.setAccountid(accountid);
        opRecord.setOptype(OpType.DEPOSITE);
        opRecord.setOpmoney(money);
        this.opRecordDao.insertOpRecord(opRecord);
        //返回新的账户信息
        Account a = new Account();
        a.setAccountid(accountid);
        a.setBalance(money);
        return a;
    }

    @Override
    public Account deposite(int accountid, double money) {
        return this.deposite(accountid,money,null);
    }

    @Override
    public Account deposite(int accountid, double money, Integer transferId) {
        Account a = null;
        try {
            a = this.accountDao.findById(accountid);
        }catch (RuntimeException e){
            log.error(e.getMessage());
            throw new RuntimeException("查无此账户"+accountid+",无法完成存款操作");
        }
        //存款时,金额累加
        a.setBalance(a.getBalance()+money);

        this.accountDao.update(accountid,a.getBalance());

        OpRecord opRecord = new OpRecord();
        opRecord.setAccountid(accountid);
        opRecord.setOpmoney(money);
        if(transferId!=null){
            opRecord.setOptype(OpType.TRANSFER);
            opRecord.setTransferid(transferId);
        }else {
            opRecord.setOptype(OpType.DEPOSITE);
        }
        this.opRecordDao.insertOpRecord(opRecord);
        return a;
    }

    @Override
    public Account withdraw(int accountid, double money) {
        return this.withdraw(accountid,money,null);
    }

    @Override
    public Account withdraw(int accountid, double money, Integer transferId) {
        Account a = null;
        try {
            a = this.accountDao.findById(accountid);
        }catch (RuntimeException e){
            log.error(e.getMessage());
            throw new RuntimeException("查无此账户"+accountid+",无法完成取款操作");
        }
        //取款
        a.setBalance(a.getBalance()-money);
        OpRecord opRecord = new OpRecord();
        opRecord.setAccountid(accountid);
        opRecord.setOpmoney(money);
        if(transferId!=null){
            opRecord.setOptype(OpType.TRANSFER);
            opRecord.setTransferid(transferId);
        }else {
            opRecord.setOptype(OpType.DEPOSITE);
        }
        //dao->datasource->connection->jdbc 隐式事务提交 ->一条sql提交一次 commit()
        this.opRecordDao.insertOpRecord(opRecord);
        this.accountDao.update(accountid,a.getBalance());
        return a;
    }

    @Override
    public Account transfer(int accountId, double money, int toAccountId) {
        //从accountId转monney到toAccountId
        this.deposite(toAccountId,money,accountId);  //收款方
        //accountId从账户中取money
        Account a = this.withdraw(accountId,money,toAccountId);
        return a;

    }

    @Override
    public Account findAccount(int accountId) {
        return this.accountDao.findById(accountId);
    }
}
