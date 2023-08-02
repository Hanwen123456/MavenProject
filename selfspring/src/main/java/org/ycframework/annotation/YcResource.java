package org.ycframework.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 15:46
 */
@Target({TYPE, FIELD, METHOD})
@Retention(RUNTIME)
public @interface YcResource {

    String name() default "";
}
