package com.spring.test5_import;

import com.spring.test3_factoryBean.Pear;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 17:21
 */
public class FruitimportSelector implements ImportSelector {
    @Override  //回调
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Pear.class.getName()};
    }
}
