package cn.ncut.java.problem;

/**
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 程序分析：请抓住分子与分母的变化规律。
 */
public class SeriesSum {
    public static void main(String[] args) {
        float numerator = 1.0f;//分母
        float denominator = 1.0f;//分子

        float temp;
        float sum = 0;
        for (int i = 0; i < 2; i++) {
            temp = numerator;
            numerator = numerator + denominator;
            denominator = temp;
            sum += numerator / denominator;
        }
        System.out.println(sum);

    }
}
