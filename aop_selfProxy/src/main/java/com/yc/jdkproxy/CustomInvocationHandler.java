package com.yc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-30 14:40
 */
public class CustomInvocationHandler implements InvocationHandler {

    private Object target;  //目标类

    public CustomInvocationHandler(Object target){
        this.target = target;
    }

    //生成代理对象的方法
    public  Object createProxy(){
        //jdk提供了Proxy类,有一个方法专门根据接口生成代理类对象的方法
        Object proxy = Proxy.newProxyInstance(CustomInvocationHandler.class.getClassLoader(),target.getClass().getInterfaces(),this);
        return proxy;   //$Proxy01: sayHello() showBye()
    }

    /**
     * @param proxy     代理对象: $Proxy01
     * @param method    调用的方法  sayHello
     * @param args      方法的参数值
     * @return
     * @throws Throwable
     */
    //当主程序钟调用生成的Proxy中的方法，会自动回调这个invoke()
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().indexOf("say")==0){
            showTime();
        }
        //反射机制调用目标类的目标方法
        Object returnValue = method.invoke(target,args);
        return returnValue;
    }


    //增强的方法
    public void showTime(){
        System.out.println("时间:"+new Date());
    }

}
