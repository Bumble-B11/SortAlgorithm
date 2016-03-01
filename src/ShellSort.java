/**
 * Created by bumblebee on 16/2/28.
 * 希尔排序算法, 先对分组内的元素进行插入排序, 逐步缩小每个组的规模直到规模等于1
 * 也可以对分组内的元素进行冒泡排序
 */
public class ShellSort {

    public static void shellSort(int[] numArray) {
        int i;
        int gap = numArray.length;

        do {
            gap = gap / 3 + 1;
             for (int k = 0; k < gap; k ++) {
                /**
                * 基于冒泡法实现希尔排序
                *
                for (i = k; i < numArray.length; i += gap) {
                    int j = k;
                    while (j < numArray.length) {
                        j += gap;
                    }
                    j = j - gap;

                    for (; j > i; j -= gap) {
                        if (numArray[j] < numArray[j - gap]) {
                            int temp = numArray[j];
                            numArray[j] = numArray[j - gap];
                            numArray[j - gap] = temp;
                        }

                    }
                }*/
                /**
                 * 基于插入法实现希尔排序
                 * for (i = gap + k; i < numArray.length; i += gap) {
                    int j = i - gap;
                    int temp = numArray[i];
                    while (j > -1) {
                        if (temp < numArray[j]) {
                            numArray[j + gap] = numArray[j];
                            numArray[j] = temp;

                        }
                        else {
                            break;
                        }
                        j -= gap;
                    }
                }*/
            }

        }while (gap > 1);
    }
}

