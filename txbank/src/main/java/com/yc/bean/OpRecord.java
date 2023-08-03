package com.yc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-03 09:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OpRecord {
    private int id;
    private int accountid;
    private double opmoney;
    private String optime;   //数据库是datatime，在java中被转成String
    private OpType optype;
    private Integer transferid;
}
