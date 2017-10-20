package cn.ncut.java.problem;

import java.util.Scanner;

/**
 * 题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 * <p>
 * 程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。
 */
public class DayOfWeek {
    public static void main(String[] args) {
        char weekSecond;//保存第二字母
        Scanner in = new Scanner(System.in);//接收用户输入
        System.out.println("请输入星期的第一个字母：");
        String letter = in.next();
        if (letter.length() == 1) {//判断用户控制台输入字符串长度是否是一个字母
            char weekFirst = letter.charAt(0);//取第一个字符
            switch (weekFirst) {
                case 'm':
                case 'M':
                    System.out.println("星期一(Monday)");
                    break;
                case 't':
                case 'T':
                    System.out.print("由于星期二(Tuesday)与星期四(Thursday)均以字母T开头，故需输入第二个字母才能正确判断：");
                    letter = in.next();
                    if (letter.length() == 1) {
                        weekSecond = letter.charAt(0);
                        if (weekSecond == 'U' || weekSecond == 'u') {
                            System.out.println("星期二(Tuesday)");
                            break;
                        } else if (weekSecond == 'H' || weekSecond == 'h') {
                            System.out.println("星期四(Thursday)");
                            break;
                        } else {
                            System.out.println("Error!");
                            break;
                        }
                    } else {
                        System.out.println("输入错误，只能输入一个字母，程序结束！");
                        break;
                    }
                case 'w':
                case 'W':
                    System.out.println("星期三(Wednesday)");
                    break;
                case 'f':
                case 'F':
                    System.out.println("星期五(Friday)");
                    break;
                case 's':
                case 'S':
                    System.out.print("由于星期六(Saturday)与星期日(Sunday)均以字母S开头，故需输入第二个字母才能正确判断：");
                    letter = in.next();
                    if (letter.length() == 1) {
                        weekSecond = letter.charAt(0);
                        if (weekSecond == 'A' || weekSecond == 'a') {
                            System.out.println("星期六(Saturday)");
                            break;
                        } else if (weekSecond == 'U' || weekSecond == 'u') {
                            System.out.println("星期日(Sunday)");
                            break;
                        } else {
                            System.out.println("Error!");
                            break;
                        }
                    } else {
                        System.out.println("输入错误，只能输入一个字母，程序结束！");
                        break;
                    }
                default:
                    System.out.println("输入错误，不能识别的星期值第一个字母，程序结束！");
                    break;
            }
        } else {
            System.out.println("输入错误，只能输入一个字母，程序结束！");
        }
    }
}
