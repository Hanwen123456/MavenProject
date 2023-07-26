package com.springtest3.user;

import com.springtest3.system.ContainerFilter;
import org.springframework.stereotype.Component;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 09:41
 */
@Component("bmiFilter")    //"bmiFilter"对象
public class StudentBmiFilter implements ContainerFilter {

    @Override
    public boolean doFilter(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        Student s = (Student) obj;
        if(s.getName()==null || "".equalsIgnoreCase(s.getName())){
            return false;
        }
        if(s.getHeight()<1 || s.getHeight()>2.7){
            System.out.println("身高数据异常"+obj.toString());
            return false;
        }
        if(s.getWeight()<30 || s.getWeight()>500){
            System.out.println("体重数据异常"+obj.toString());
        }
        return true;
    }
}
