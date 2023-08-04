package com.yc;

import com.yc.biz.AccountBiz;
import com.yc.configs.Config;
import junit.framework.TestCase;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-02 14:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
@Log4j2
public class Test1 extends TestCase {
    @Autowired
    private AccountBiz accountBiz;

    //单元测试用例
    @Test
    public void testAddAccount(){
//        accountBiz.addAccount(1,99);
        log.error("hhhhhh");
    }

    //引入断言
    @Test
    public void testAdd(){
        int x = 3,y=4;
        Assert.assertEquals(7,x+y);
    }

}
