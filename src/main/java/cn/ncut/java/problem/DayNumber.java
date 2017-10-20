package cn.ncut.java.problem;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * <p>
 * 程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本月的第几天，
 * 特殊情况，闰年且输入月份大于3时需考虑多加一天
 */
public class DayNumber {

    public static void main(String[] args) {

        System.out.println("请输入年,月,日：");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();

        method3(year, month, day);

    }

    public static void method1(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int sum = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println("这一天是这一年的第" + sum + "天");
    }

    public static void method2(int year, int month, int day) {
        int sum;
        switch (month) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 59;
                break;
            case 4:
                sum = 90;
                break;
            case 5:
                sum = 120;
                break;
            case 6:
                sum = 151;
                break;
            case 7:
                sum = 181;
                break;
            case 8:
                sum = 212;
                break;
            case 9:
                sum = 243;
                break;
            case 10:
                sum = 273;
                break;
            case 11:
                sum = 304;
                break;
            case 12:
                sum = 334;
                break;
            default:
                System.out.println("wrong input!");
                return;
        }

        sum = sum + day;
        boolean leapYear;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        if (leapYear && month > 2) {
            sum++;
        }

        System.out.println("It is the " + sum + "th day.");
    }


    public static void method3(int year, int month, int day) {
        int sum = 0;
        int days = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
            sum += days;
        }
        sum += day;
        System.out.println("It is the " + sum + "th day.");
    }
}
