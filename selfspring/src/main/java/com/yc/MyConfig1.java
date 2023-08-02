package com.yc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 15:20
 */
@Configuration
@ComponentScan(basePackages = {"com.yc"})
@PropertySource(value = "db.properties")
@EnableAspectJAutoProxy //启用AspectJ支持
public class MyConfig1 {

}
