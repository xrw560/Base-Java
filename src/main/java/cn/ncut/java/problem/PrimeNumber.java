package cn.ncut.java.problem;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * <p>
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 */
public class PrimeNumber {

    //0 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(" " + i);
            }
        }
    }

}
