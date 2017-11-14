package cn.ncut.java.base.futures;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/11/14.
 */
public class FutureTaskExample {

    public static void main(String[] args) {
        MyCallable callable1 = new MyCallable(1000);//要执行的任务
        MyCallable callable2 = new MyCallable(5000);

        //将Callable写的任务封装到一个由执行者调度的FutureTask对象
        FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

        ExecutorService executor = Executors.newFixedThreadPool(2);//创建线程池并返回ExecutorService实例
        executor.submit(futureTask1);//执行任务
        executor.submit(futureTask2);

        try {
            if (futureTask1.isDone() && futureTask2.isDone()) {//两个任务都完成
                System.out.println("DONE");
                executor.shutdown();//关闭线程池和服务
                return;
            }
            if (!futureTask1.isDone()) {//任务1没有完成，会等待，知道任务完成
                System.out.println("FutureTask1 output=" + futureTask1.get());
            }
            System.out.println("Waiting for FutureTask2 to complete");
            String s = futureTask2.get(2, TimeUnit.SECONDS);
            if (s != null) {
                System.out.println("FutureTask2 output=" + s);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("FutureTask2 未获取到结果");
        }
    }
}
