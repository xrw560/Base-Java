package cn.ncut.java.problem;

/**
 * 题目：输出9*9口诀乘法表。
 * 程序分析：分行与列考虑，共9行9列，i 控制行，j 控制列。
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        noRepitition();
    }

    /**
     * 出现重复的乘积（全矩形）
     */
    public static void repitition() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void noRepitition() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }

}
