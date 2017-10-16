package cn.ncut.java.problem;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Rebound {

    public static void main(String[] args) {
        double sum = 0;
        double high = 100;
        for (int i = 0; i < 1; i++) {
            sum += high;
            high = high / 2;
            sum += high;
        }
        sum -= high;
        System.out.println("经过路程：" + sum);
        System.out.println("反弹高度：" + high);
    }
}
