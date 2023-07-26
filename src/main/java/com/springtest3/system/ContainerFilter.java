package com.springtest3.system;

/**
 * @program: MavenProject
 * @description:  容器过滤接口
 * @author: 作者
 * @create: 2023-07-26 08:41
 */
public interface ContainerFilter {

    /**
     * 判断此对象是否为有效对象
     * @param obj
     * @return
     */
    public boolean doFilter(Object obj);


}
