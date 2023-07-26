package com.springtest3.system;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 08:40
 */
//TODO :要用spring完成托管  选@Component @Service @Repository @Controller
@Component
public class Container<T>{
    private List<T> objs = new ArrayList<T>();
    //要用spring完成DI
    //方案一
//    @Autowired
//    @Qualifier(value = "bmiMeasure");
    //方案二
    @Resource(name = "bmiMeasure")
    private Measure measure;
    @Resource(name = "bmiFilter")
    private ContainerFilter Filter;

    private T max;
    private T min;
    private double avg;
    private double sum;

    /**
     * 添加对象的方法
     * @param t
     */
    public void add(T t){
        //判断t是否合格  调用筛选的实现
        if(Filter!=null){
            if(Filter.doFilter(t)==false){
                return;
            }
        }
        //添加到objs
        objs.add(t);
        //判断大小,记录max,min,计算avg
        if(objs.size()==1){
            max = t;
            min = t;
        }else{
            //测出值，判断大小
            double val = this.measure.doMeasure(t);
            double maxval = this.measure.doMeasure(max);
            double minval = this.measure.doMeasure(min);
            if(val>maxval){
                max = t;
            }
            if(val<minval){
                min = t;
            }
        }
        sum+= measure.doMeasure(t);
        avg = sum/objs.size();
    }

    /**
     * 有效的测量 对象有多少个
     * @return
     */
    public int size(){
        return objs.size();
    }

    public T getMax() {
        return max;
    }

    public T getMin() {
        return min;
    }

    public double getAvg() {
        return avg;
    }

    /**
     * 系统复位
     */
    public void clearAll(){
        objs = new ArrayList<T>();
        measure = null;
        Filter = null;
        max = null;
        min = null;
        avg = 0;
    }
}
