package org.ycframework.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 15:18
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface YcService {
    String value() default "";
}
