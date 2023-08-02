package com.yc.dao;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 16:19
 */
@Repository
public class UserDaoImpl1 implements UserDao{

    @Override
    public void add(String uname) {
        Random r = new Random();
        int i = r.nextInt(2);
        if(i==0){
//            throw new RuntimeException();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("dao添加了"+uname);
    }
}
