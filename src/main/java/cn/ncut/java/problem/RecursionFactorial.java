package cn.ncut.java.problem;

import java.util.Scanner;

/**
 * 题目：利用递归方法求5!。
 * 程序分析：递归公式：f(n)=f(n-1)*4!
 */
public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n + "的阶乘为：" + fac2(n));
    }

    public static long fac1(int n) {
        long value = n;
        if (n > 1) {
            value *= fac1(n - 1);
        } else {
            value *= 1;
        }
        return value;
    }

    public static long fac2(int n) {
        long value = 0;
        if (n == 1 || n == 0) {
            value = 1;
        } else if (n > 1) {
            value = n * fac2(n - 1);
        }
        return value;
    }
}
