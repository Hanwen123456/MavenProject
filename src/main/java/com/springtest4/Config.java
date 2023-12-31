package com.springtest4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 20:52
 */
@Configuration
@ComponentScan
@PropertySource(value="classpath:db.properties")
public class Config {
}
