package org.ycframework.context;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-27 17:12
 */

/**
 * 对一个Bean的特征的包装类
 * 特征: scope(singleton/prototype)
 *      lazay(true/false) 懒加载
 *      primary:主实例
 */
public class YcBeanDefinition {
    private boolean isLazy;
    private String scope = "singleton";
    private boolean isPrimary;

    private String classInfo; //类的实例信息

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }
}
