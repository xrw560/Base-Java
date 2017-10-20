package cn.ncut.java.problem;

/**
 * 题目：求100之内的素数
 */
public class WhichIsPrimeNumber {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int j;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) break;
            }
            if (j > i / 2) {
                System.out.println(i + "是素数");
            }
        }

    }
}
