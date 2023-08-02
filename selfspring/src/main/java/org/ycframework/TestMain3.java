package org.ycframework;

import com.yc.MyConfig;
import com.yc.service.UserBiz;
import org.ycframework.context.YcAnnotationConfigApplicationContext;
import org.ycframework.context.YcApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 14:46
 */
public class TestMain3 {

    public static void main(String[] args) {
//        Logger logger = LoggerFactory.getLogger(TestMain3.class);
//        logger.error("error");
//        logger.warn("warn");
//        logger.info("info");
//        logger.debug("debug");
//        logger.trace("trace");

        YcApplicationContext ac = new YcAnnotationConfigApplicationContext(MyConfig.class);
        UserBiz biz = (UserBiz) ac.getBean("ub");
        biz.addUser("张三");

    }
}
