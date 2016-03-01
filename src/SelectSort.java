/**
 * Created by bumblebee on 16/2/27.
 * 选择排序法
 */
public class SelectSort {

    public static void selectSort(int[] numArray) {
        int i, j, k;

        for (i = 0; i < numArray.length; i ++) {
            k = i;
            for (j = i + 1; j < numArray.length; j ++) {
                if (numArray[k] > numArray[j]) {
                    k = j;
                }
            }

            int temp;
            temp = numArray[i];
            numArray[i] = numArray[k];
            numArray[k] = temp;
        }
    }
}
