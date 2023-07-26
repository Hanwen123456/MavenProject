package com.springtest3.system;

/**
 * @program: MavenProject
 * @description:  测量 接口
 * @author: 作者
 * @create: 2023-07-26 08:43
 */
public interface Measure {

    /**
     *
     * @param obj  待测量的对象
     * @return     测量值
     */
    public double doMeasure(Object obj);
}
