package cn.ncut.java.base.mythread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 列出并发包中的各种线程池
 */

public class ExecutorDemo {

    public static void main(String[] args) {

        //只有一个线程的线程池，因此所有提交的任务是顺序执行
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();

        //线程池里有很多线程需要同时执行，老的可用线程将被新的任务触发重新执行，如果线程超过60秒内没执行，那么将被终止并从池中删除
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

        //拥有固定线程数的线程池，如果没有任务执行，那么线程会一直等待
        int cpuNums = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuNums);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(cpuNums);

        //用来调度即将执行的任务的线程池，可能是不是直接执行, 每隔多久执行一次... 策略型的
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(8);

        //只有一个线程，用来调度任务在指定时间执行
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
    }
}
