package com.spring.test5_import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 17:20
 */
@Configuration
@Import({Banana.class,FruitimportSelector.class})
public class AppConfig_2 {
}
