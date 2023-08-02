package com.yc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 09:32
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.yc")
public class Config {
}
