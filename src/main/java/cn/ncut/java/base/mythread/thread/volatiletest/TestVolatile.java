package cn.ncut.java.base.mythread.thread.volatiletest;

/**
 * 适用于一个线程是值的更改，其他只是读
 * volatile保证线程每次都要去主内存中取
 * <p>
 * volatile可以保证完成之后一定会刷回主内存
 * 在工作内存有(操作)过程，不是线程安全的
 * <p>
 * volatile主要用于工作内存与主内存同步的
 * 如果不用volatile的话，有一个线程把变量改了，其他线程就不一定马上把变量同步过来，这样看到的值是以前的值
 */
public class TestVolatile {

    public static volatile int numb = 0;

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 100; i++) {

            new Thread(new Runnable() {

                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        //运算过程有四个步骤，在四个步骤返回之前，其他线程拿的是原来的数据
                        numb++;
                    }
                }
            }).start();

        }

        Thread.sleep(2000);
        System.out.println(numb);
    }

}
