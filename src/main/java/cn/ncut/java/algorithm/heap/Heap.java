package cn.ncut.java.algorithm.heap;

/**
 * Created by zhouning on 2017/12/4.
 * desc:
 */
public abstract class Heap<T extends Comparable<T>> {

    public int left(int i) {
        return (i + 1) * 2 - 1;
    }

    public int right(int i) {
        return (i + 1) * 2;
    }

    public int parent(int i) {
        //i为根节点
        if (i == 0) {
            return -1;
        }
        return (i - 1) / 2;
    }

    /**
     * @param a          保存堆的数组
     * @param i          堆中需要下降的元素
     * @param heapLength 堆元素个数
     */
    public abstract void heapify(T[] a, int i, int heapLength);


    /**
     * 建堆
     *
     * @param a          数组
     * @param headLength 堆元素个数
     */
    public void buildHeap(T[] a, int headLength) {
        //从后向前看，lengthParant处的元素是第一个有孩子节点的节点
        int lengthParent = parent(headLength - 1);
        //最初，parent(length)之后所有的元素都是叶子节点；
        //因为大于Length/2处元素的孩子节点如果存在，那么它们的数组下标值必定大于length，这与事实不符
        //在数组中，孩子元素必定在父元素的后面，从后往前对元素调用maxHeapify，保证了元素的孩子都是大根堆或小根堆
        for (int i = lengthParent; i >= 0; i--) {
            heapify(a, i, headLength);
        }
    }


}
