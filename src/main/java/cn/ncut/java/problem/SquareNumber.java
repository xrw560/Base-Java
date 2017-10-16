package cn.ncut.java.problem;

/**
 * 题目：一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
 * 程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上168后再开方，如果开方后的结果满足如下条件，即是结果。
 */
public class SquareNumber {

    public static void main(String[] args) {

        for (int i = 1; i < 100000; i++) {
            if (Math.sqrt(i + 100) % 1 == 0)
                if (Math.sqrt(i + 100 + 168) % 1 == 0)
                    System.out.println(i + "加上100后是一个完全平方数，加上168又是一个完全平方数");
        }

    }
}
