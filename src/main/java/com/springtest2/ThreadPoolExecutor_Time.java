package com.springtest2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: Learning
 * @description:
 * @author: 作者
 * @create: 2023-07-27 09:57
 */
public class ThreadPoolExecutor_Time {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            executor.execute(() -> {
                printCurrentTime(finalI);
            });
        }

        executor.shutdown();
    }

    private static void printCurrentTime(int i) {
        Date date = new Date();
        DateFormat dtft = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        System.out.println("子线程" + i + ":"+dtft.format(date));
    }
}
