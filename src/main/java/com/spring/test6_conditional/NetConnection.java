package com.spring.test6_conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 18:43
 */
@Component
@Conditional({SystemCondition.class})
public class NetConnection {

}
