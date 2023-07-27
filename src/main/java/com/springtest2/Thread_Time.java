package com.springtest2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: Learning
 * @description:
 * @author: 作者
 * @create: 2023-07-25 18:46
 */
public class Thread_Time {

    public static void main(String []args){
        int i;
        for(i=0;i<5;i++){
            Time_Task task = new Time_Task(i);
            Thread thread = new Thread(task);
            thread.start();
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}


class Time_Task implements Runnable{
    private int i;
    public Time_Task(int i){
        this.i=i;
    }

    @Override
    public void run() {
        Date date = new Date();
        DateFormat dtft = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        System.out.println("子线程" + i + ":"+dtft.format(date));
    }
}
