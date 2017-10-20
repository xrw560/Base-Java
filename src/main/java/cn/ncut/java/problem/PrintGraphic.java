package cn.ncut.java.problem;

/**
 * 题目：打印出如下图案（菱形）
 * 程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，
 * 利用双重for循环，第一层控制行，第二层控制列。
 */
public class PrintGraphic {
    public static void main(String[] args) {
        printRhombus();
    }

    public static void printTriangle() {
        /**
         * 三角形：
         * *
         * ***
         * ******
         * ********
         * ******
         * ***
         * *
         */
        int i = 0;
        int j = 0;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 3; i >= 1; i--) {
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRhombus() {
        /**
         * 菱形：
         *    *
         *   ***
         *  *****
         * *******
         *  *****
         *   ***
         *    *
         *
         */

        int i = 0;
        int j = 0;
        for (i = 1; i <= 4; i++) {
            for (int k = 1; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 3; i >= 1; i--) {
            for (int k = 1; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
