package cn.ncut.java.problem;

import java.util.Scanner;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class PalindromicNumber {
    public static void main(String[] args) {

        System.out.println("请输入一个5位数：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = Integer.parseInt(str);
        if (n < 10000 || n > 99999) {
            System.out.println("输入错误！");
            System.exit(0);
        }
        boolean flag = false;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[i] != ch[ch.length - 1 - i]) {
                flag = false;
            } else {
                flag = true;
            }
        }
        System.out.println(flag ? "这是一个回文" : "不是回文");
    }
}
