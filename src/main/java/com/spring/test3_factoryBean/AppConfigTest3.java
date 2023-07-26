package com.spring.test3_factoryBean;

import org.springframework.context.annotation.Bean;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 14:38
 */
public class AppConfigTest3 {


    @Bean
    public FruitFactoryBean ffb(){
        return new FruitFactoryBean();
    }



}
