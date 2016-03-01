/**
 * Created by bumblebee on 16/2/29.
 *
 * 归并排序: 二路归并:先将数据分为两路,一直递归直到每组数据都只剩下一个元素(因为一个元素一定是有序的), 接着用两个指针分别对两组的数据进行扫描并归并到一个组中.
 */
public class MergeSort {

    public static void merge(int[] src, int[]des, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (src[i] < src[j]) {
                des[k ++] = src[i ++];
            }

            else {
                des[k ++] = src[j ++];
            }
        }

        while (i <= mid) {
            des[k ++] = src[i ++];
        }

        while (j <= high) {
            des[k ++] = src[j ++];
        }
    }

    public static void mSort(int[] src, int[]des, int low, int high, int max) {
        if (low == high) {
            des[low] = src[low];
        }

        else {
            int mid = (low + high) / 2;

            int[] space = new int[max];

            mSort(src, space, low, mid, max);
            mSort(src, space, mid + 1, high, max);

            merge(space, des, low, mid, high);
        }
    }

    public static void mergeSort(int[] array) {
        mSort(array, array, 0, array.length - 1, array.length);
    }
}
