package org.ycframework.annotation;


import java.lang.annotation.*;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 17:26
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface YcPropertySource {
    String name() default "";

    String[] value();

    boolean ignoreResourceNotFound() default false;

    String encoding() default "";

}
