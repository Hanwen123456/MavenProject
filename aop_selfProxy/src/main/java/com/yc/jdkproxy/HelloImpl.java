package com.yc.jdkproxy;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-30 14:38
 */
public class HelloImpl implements HelloI{
    @Override
    public void sayHello() {
        System.out.println("HelloImpl中的sayHello()");
    }

    @Override
    public void sayBye() {
        System.out.println("HelloImpl中的sayBye()");
    }
}
