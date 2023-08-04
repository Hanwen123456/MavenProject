package com.yc.biz;

import com.yc.bean.Account;
import com.yc.configs.Config;
import com.yc.configs.DataSourceConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class, DataSourceConfig.class})
@Log4j2
public class AccountBizImplTest {
    @Autowired
    private AccountBiz accountBiz;

    @Test
    public void openAccount() {
        Account a = accountBiz.openAccount(100);
        Assert.assertNotNull(a);
        log.info(a);
    }

    @Test
    public void deposite() {
        Account a = accountBiz.deposite(2,2);
        Assert.assertNotNull(a);
        log.info(a);
    }


    @Test
    public void withdraw() {
        Account a = accountBiz.withdraw(2,1000);
        Assert.assertNotNull(a);
        log.info(a);
    }


    @Test
    public void transfer() {
        Account a = accountBiz.transfer(4,5000,3);
        Assert.assertNotNull(a);
        log.info(a);
    }

    @Test
    public void findAccount() {
        Account a = accountBiz.findAccount(2);
        Assert.assertNotNull(a);
        log.info(a);

    }
}