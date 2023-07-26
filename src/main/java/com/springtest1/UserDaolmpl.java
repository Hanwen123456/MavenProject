package com.springtest1;

import com.springtest1.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 08:56
 */
@Repository               //Repository标识这是一个dao层的类,由sping托管
public class UserDaolmpl implements UserDao {

    public UserDaolmpl(){System.out.println("UserDaolmpl类的构造...");}

    @Override
    public void add(String name) {
        System.out.println("添加了:"+name);
    }

}
