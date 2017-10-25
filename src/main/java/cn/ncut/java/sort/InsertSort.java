package cn.ncut.java.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度：O（n^2）.
 */
public class InsertSort {
    public static void main(String[] args) {
        int array[] = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] array) {
        int j, temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];//待插入元素
            for (j = i; j > 0 && temp < array[j - 1]; j--) {//通过循环，逐个后移一位找到要插入的位置
                array[j] = array[j - 1];
            }
            array[j] = temp;//插入
        }
    }
}
