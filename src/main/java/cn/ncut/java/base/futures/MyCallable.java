package cn.ncut.java.base.futures;

import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2017/11/14.
 */
public class MyCallable implements Callable<String> {
    private long waitTime;

    public MyCallable(long waitTime) {
        this.waitTime = waitTime;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        return Thread.currentThread().getName();
    }
}
