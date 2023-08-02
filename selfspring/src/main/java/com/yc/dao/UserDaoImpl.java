package com.yc.dao;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 16:19
 */
//@YcRepository
public class UserDaoImpl implements UserDao{

    @Override
    public void add(String uname) {
        System.out.println("dao添加了"+uname);
    }
}
