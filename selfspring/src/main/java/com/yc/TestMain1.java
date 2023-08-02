package com.yc;

import com.yc.service.UserBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 14:34
 */
public class TestMain1 {

    public static void main(String[] args) {
//        Logger logger = LoggerFactory.getLogger(TestMain1.class);
//        logger.error("error");
//        logger.warn("warn");
//        logger.info("info");
//        logger.debug("debug");
//        logger.trace("trace");

        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig1.class);
        UserBiz biz = (UserBiz) ac.getBean("ub1");
        biz.addUser("张三");
    }

}
