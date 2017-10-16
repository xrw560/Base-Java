package cn.ncut.java.base.mythread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * callable 跟runnable的区别：
 * runnable的run方法不会有任何返回结果，所以主线程无法获得任务线程的返回值
 * <p>
 * callable的call方法可以返回结果，但是主线程在获取时是被阻塞，需要等待任务线程返回才能拿到结果
 */
public class ThreadPoolWithcallable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService pool = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            Future<String> submit = pool.submit(new Callable<String>() {

                public String call() throws Exception {
                    //System.out.println("a");
                    Thread.sleep(5000);
                    return "b--" + Thread.currentThread().getName();
                }
            });
            //从Future中get结果，这个方法是会被阻塞的，一直要等到线程任务返回结果
            //如果主线程需要任务线程的执行结果时，才需要这么使用，否则就没有必要
            System.out.println(submit.get());
        }
        pool.shutdown();

    }

}
