/**
 * Created by bumblebee on 16/2/27.
 * 冒泡排序法
 */

public class BubbleSort {
    public static void bubbleSort(int[] numArray) {
        for (int i = 0; i < numArray.length; i ++) {
            for (int j = numArray.length - 1; j > i; j --) {
                if (numArray[j] < numArray[j - 1]) {
                    int temp = numArray[j];
                    numArray[j] = numArray[j - 1];
                    numArray[j - 1] = temp;
                }
            }
        }
    }
}