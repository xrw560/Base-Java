package cn.ncut.java.problem;

/**
 * 题目：求1+2!+3!+...+20!的和。
 * 程序分析：此程序只是把累加变成了累乘。
 */
public class factorial {
    public static void main(String[] args) {
        long sum = 0;
        long fac = 1;
        for (int i = 1; i < 4; i++) {
            fac *= i;
            sum += fac;
        }
        System.out.println(sum);
    }
}
