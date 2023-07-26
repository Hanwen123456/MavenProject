package com.springtest1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 08:54
 */

@Configuration    //此类是一个配置类(这个类也会被spring创建)，声明容器运行时的一些配置信息
// (1.扫描的路径，这个路径所有带有@Component,@Repository,@Service,@Controller这样的注解的类都会被spring托管)
@ComponentScan(basePackages={"com.springtest1"})
public class Config {

}
