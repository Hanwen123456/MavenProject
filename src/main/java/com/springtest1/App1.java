package com.springtest1;

import com.springtest1.biz.UserBiz;
import com.springtest1.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 09:48
 */
public class App1 {
    public static void main(String[] args){
        //首先创建容器
        // ClassPathXmlApplicationContext 类路径下有一个xml文件来配置,生成容器
        //FileSystemXmlApplicationContext  FileSystem任意路径(c:/...) 文件系统路径下的xml配置文件来生产容器
        //AnnotationConfigApplicationContext 读取注解的类(@Configuration),生成容器
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        //容器中已经创建好了这个类  "键:userDaolmpl"  值:是对象
        UserDao ud = (UserDao) container.getBean("userDaolmpl");
        System.out.println(ud);
        ud.add("张三");

        //取业务层的类
        UserBiz ub = (UserBiz) container.getBean("userBizlmpl");
        ub.add("李四");

        UserDao udd = new UserDaolmpl();
        udd.add("王五");
    }
}
