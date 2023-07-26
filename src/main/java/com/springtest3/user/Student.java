package com.springtest3.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 08:51
 */
@Data
@AllArgsConstructor  //带所有参数的构造方法
@NoArgsConstructor   //无参构造方法
public class Student {
    private String name;
    private double height;
    private double weight;


}
