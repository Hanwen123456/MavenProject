package com.spring.test6_conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 18:44
 */
public class SystemCondition implements Condition {

    /**
     * 匹配方法: 看服务器操作系统
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Environment environment = context.getEnvironment();
        String osname = environment.getProperty("os.name");
        if(osname.contains("Windows")){
            return true;
        }
        return false;
    }
}
