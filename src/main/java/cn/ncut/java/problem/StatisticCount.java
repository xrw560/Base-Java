package cn.ncut.java.problem;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * <p>
 * 程序分析：利用for循环语句,if条件语句。
 */
public class StatisticCount {

    public static void main(String[] args) {
        compute("*he0 zs 2");
    }

    public static void compute(String str) {
        int digital = 0, character = 0, blank = 0, other = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                digital++;
            } else if ((arr[i] > 'a' && arr[i] <= 'z') || (arr[i] > 'A' && arr[i] <= 'Z')) {
                character++;
            } else if (arr[i] == ' ') {
                blank++;
            } else {
                other++;
            }
        }
        System.out.println("数字个数：" + digital);
        System.out.println("英文字母个数：" + character);
        System.out.println("空格个数：" + blank);
        System.out.println("其他字符个数：" + other);
    }

}
