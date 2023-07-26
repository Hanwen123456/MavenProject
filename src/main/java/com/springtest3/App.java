package com.springtest3;

import com.springtest3.system.Container;
import com.springtest3.user.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 10:14
 */
public class App {

    public static void main(String []args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        Container c = (Container) ac.getBean("container");

        c.add(new Student("张三",1.7,90));
        c.add(new Student("李四",1.8,80));  //低
        c.add(new Student("王五",1.6,100));  //高
        c.add(new Student("异常",0.3,1));

        System.out.println(c.getMax());
        System.out.println(c.getMin());
        System.out.println(c.getAvg());
        System.out.println(c.size());
    }
}
