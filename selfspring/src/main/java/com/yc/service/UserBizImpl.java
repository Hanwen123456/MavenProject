package com.yc.service;

import com.yc.dao.UserDao;
import org.ycframework.annotation.YcResource;
import org.ycframework.annotation.YcService;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 16:20
 */
@YcService(value = "ub")
public class UserBizImpl implements UserBiz{

    public UserBizImpl() {
        System.out.println("biz初始化");
    }

    @YcResource(name="userDaoImpl")
    private UserDao userDao;

    @Override
    public int addUser(String uname) {
        userDao.add(uname);
        return 10;
    }
}
