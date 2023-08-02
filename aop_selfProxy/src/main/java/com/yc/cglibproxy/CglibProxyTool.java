package com.yc.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-01 21:23
 */
public class CglibProxyTool implements MethodInterceptor {
    private Object target;

    public CglibProxyTool(Object target){
        this.target = target;
    }


    //生成代理对象的方法
    public Object createProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        Object proxy = enhancer.create();
        return proxy;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if(method.getName().startsWith("add")){
            showHello();
        }
        Object returnValue = method.invoke(target,args);
        return returnValue;
    }

    private void showHello() {
        System.out.println("hello");
    }
}
