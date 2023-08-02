package com.yc.service;

import com.yc.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 16:20
 */
@Service(value = "ub1")
public class UserBizImpl1 implements UserBiz{

    public UserBizImpl1() {
        System.out.println("biz初始化");
    }

    @Resource(name="userDaoImpl1")
    private UserDao userDao;

    @Override
    public int addUser(String uname) {
        userDao.add(uname);
        return 10;
    }
}
