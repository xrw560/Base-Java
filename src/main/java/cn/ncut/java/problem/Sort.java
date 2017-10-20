package cn.ncut.java.problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 程序分析：我们想办法把最小的数放到x上，
 * 先将x与y进行比较，如果x>y则将x与y的值进行交换，
 * 然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小
 */
public class Sort {

    public static void main(String[] args) {
        System.out.println("请输入3个数");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
