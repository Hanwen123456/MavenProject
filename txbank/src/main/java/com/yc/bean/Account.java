package com.yc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-03 09:36
 */
@Data
@AllArgsConstructor    //带所有参数的构造方法
@NoArgsConstructor    //空参数的构造方法
@ToString
public class Account implements Serializable {
    private int accountid;
    private double balance;
}
