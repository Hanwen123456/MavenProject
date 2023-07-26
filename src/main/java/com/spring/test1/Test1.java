package com.spring.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-25 19:23
 */
public class Test1 {
    public static void main(String []args){
        //1.早期的程序  控制不反转，由程序来创建对象， Test1依赖于Student
//        Student student = new Student();
//        student.setId(1);
//        student.setName("张三");
//        System.out.println(student.toString());

        //2.引入spring的IOC机制
        //  IOC:控制反转   由spring来创建Student对象  ClassPathXmlApplicationContext:类路径下的xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //上面这句:  启动容器,读取clss路径下的beans.xml文件,并获取bean配置的class,实例化对象存到容器中
//        ApplicationContext context = new FileSystemXmlApplicationContext("file:///d:\\beans.xml");
        //第三种 applicationContext
//        Resource res = new ClassPathResource("beans.xml");
//        BeanFactory context = new XmlBeanFactory(res);
//
//        Student s = (Student) context.getBean("s");
//        System.out.println(s);
//
//        //容器的好处:容器来管理bean,比如单例:
//        Student s1 = (Student) context.getBean("s");
//        Student s2 = (Student) context.getBean("s");
//        System.out.println(s1.hashCode()+"\t"+s2.hashCode());

        //TODO:让属性有值:  -->DI  -->Dependency injection 依赖注入
        Student ss = (Student) context.getBean("s");
        System.out.println(ss);


    }
}
