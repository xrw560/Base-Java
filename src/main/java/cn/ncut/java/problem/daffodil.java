package cn.ncut.java.problem;

/**
 * 题目：打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
 * <p>
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class daffodil {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            if (compute(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean compute(int x) {
        int i = 0, j = 0, k = 0;
        i = x / 100;
        j = (x % 100) / 10;
        k = x % 10;
        if (x == i * i * i + j * j * j + k * k * k) {
            return true;
        } else {
            return false;
        }
    }
}
