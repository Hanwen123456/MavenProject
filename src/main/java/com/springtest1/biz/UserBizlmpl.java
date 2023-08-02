package com.springtest1.biz;

import com.springtest1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 08:58
 */
@Service
@Repository
public class UserBizlmpl implements UserBiz{


    @PostConstruct  //构造方法
    public void init(){
        System.out.println("做初始化...");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁之前，关闭文件，工作...");
    }

    //将dao层的对象注入到biz DI依赖注入(将spring容器中托管的userDao对象传到此处)
    @Autowired  //根据类型来完成注入,在spring容器中根据类型 UserDao接口找实例
    @Qualifier("userDaolmpl")
    private UserDao userDao;


    private UserBizlmpl(){
        System.out.println("userBizlmpl的构造");
    }

    @Override
    public void add(String name){
        userDao.add(name);
    }

}
