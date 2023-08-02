package com.yc;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.ycframework.annotation.YcComponentScan;
import org.ycframework.annotation.YcConfiguration;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 15:20
 */
@YcConfiguration
@YcComponentScan(basePackages = {"com.yc"})
@EnableAspectJAutoProxy //启用AspectJ支持
public class MyConfig {

}
