package cn.ncut.java.problem;

/**
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * <p>
 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
 */
public class ComposeNumber {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && i != k) {
                        count++;
                        System.out.print(i * 100 + j * 10 + k + " ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("共" + count + "个三位数");
    }
}
