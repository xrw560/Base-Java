package cn.ncut.java.algorithm.heap;

/**
 * Created by zhouning on 2017/12/4.
 * desc:
 */
public class HeapSortBasedOnMaxHeap<T extends Comparable<T>> extends MaxHeap<T> {

    /**
     * 排序0到a.length-1的元素
     *
     * @param a
     */
    public void sort(T[] a) {
        //最初，堆的长度就是整个数组的长度
        int heapLength = a.length;
        buildHeap(a, heapLength);
        for (int i = heapLength - 1; i >= 0; i--) {
            T temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            heapLength--;
            heapify(a, 0, heapLength);
        }

    }

    public static void main(String[] args) {
        Integer[] heap = new Integer[]{0, 3, -1, 5, 12, 7};
        new HeapSortBasedOnMaxHeap<Integer>().sort(heap);
        for (Integer integer : heap) {
            System.out.print(integer + " ");
        }
    }

}
