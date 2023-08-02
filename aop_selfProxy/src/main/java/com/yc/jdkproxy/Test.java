package com.yc.jdkproxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-30 15:08
 */
public class Test {
    public static void main(String[] args) {

        //设置代理生成的字节码,保存到当前目录
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        HelloI target = new HelloImpl();  //目标类

        CustomInvocationHandler handler = new CustomInvocationHandler(target);
        //生成代理类
        Object proxy = handler.createProxy();
        System.out.println(proxy);

        HelloI hi = (HelloI) proxy;
        hi.sayHello();
        hi.sayBye();
    }
}
