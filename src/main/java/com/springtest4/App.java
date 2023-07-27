package com.springtest4;

import com.springtest4.user.BankAccount;
import com.springtest4.user.BankAccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 21:14
 */
public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
//        DataSource ds = (DataSource) ac.getBean("myDataSource");
//
//        Connection con = ds.getConnection();
//        System.out.println(con);

        BankAccountDao bad = (BankAccountDao) ac.getBean("bankAccountDao");
        List<BankAccount> list = bad.findAll();
        for(BankAccount ba : list){
            System.out.println(ba);
        }

    }
}
