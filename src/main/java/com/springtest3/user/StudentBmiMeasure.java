package com.springtest3.user;

import com.springtest3.system.Measure;
import org.springframework.stereotype.Component;

/**
 * @program: MavenProject
 * @description:  学生的Bmi指数测量接口
 * @author: 作者
 * @create: 2023-07-26 09:37
 */
@Component("bmiMeasure")
public class StudentBmiMeasure implements Measure {

    @Override
    public double doMeasure(Object obj) {
        if(obj ==null){
            throw new RuntimeException("待测数据异常");
        }
        if(!(obj instanceof Student)){
            throw new RuntimeException("待测数据异常");
        }
        Student s = (Student) obj;
        return s.getWeight()/(s.getHeight()*s.getHeight());
    }
}
