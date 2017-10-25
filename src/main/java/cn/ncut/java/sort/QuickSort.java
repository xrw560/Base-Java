package cn.ncut.java.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,
 * 通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
 * 此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        _quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static int getMiddle(int[] list, int low, int high) {
        int temp = list[low];//数组的第一个作为中轴
        while (low < high) {
            while (low < high && list[high] >= temp) {//从high开始找比基准小的，与low换位置
                high--;
            }
            list[low] = list[high];//比中轴小的记录移动到低端
            while (low < high && list[low] <= temp) {//从low开始找比基准大,放到之前high空出来的位置上
                low++;
            }
            list[high] = list[low];//比中轴大的记录移动到高端
        }
        list[low] = temp;//此时low=high 是基准元素的位置，也是空出来的那个位置
        return low;//返回中轴位置
    }

    private static void _quickSort(int[] list, int low, int high) {
        if (low < high) {//如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle = getMiddle(list, low, high);//将list数组进行一分为二
            _quickSort(list, low, middle - 1);//对低子表进行递归排序
            _quickSort(list, middle + 1, high);//对高子表进行递归排序
        }
    }


}
