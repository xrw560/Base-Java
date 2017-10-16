package cn.ncut.java.base.mythread.pool;

public class Test {
    public static void main(String[] args) {
        //获取CPU核数
        int num = Runtime.getRuntime().availableProcessors();
        System.out.println(num);
    }

}
