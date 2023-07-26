package com.spring.test4_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 15:49
 */
@Configuration
@ComponentScan(basePackages = "com.spring.test4_annotation")
public class AppConfig {

    //@Bean 原来是利用@Bean来创建bean交给spring
}
