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
@PropertySource(value="classpath:db.properties") //spring启动时 PropertySource类扫描 classpath:db.properties
                                                 //以键值对存
public class Config {
}
