package cn.ncut.java.problem;

import java.util.Scanner;

/**
 * 题目：给一个不多于5位的正整数，
 * 要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class PrintNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.matches("\\d+")) {
            System.out.println("输入的是" + str.trim().length() + "位数");
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse());
        }
    }
}
