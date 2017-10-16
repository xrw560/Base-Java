package cn.ncut.java.problem;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 程序分析：利用辗除法。
 */
public class Divisor {
    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        int x = compute(a, b);
        int y = a * b / x;
        System.out.println("最大公约数：" + x + " ; 最小公倍数：" + y);
    }

    public static int compute(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        while (n != 0) {
            if (m == n) {
                return m;
            } else {
                int k = m % n;
                m = n;
                n = k;
            }
        }
        return m;
    }
}
