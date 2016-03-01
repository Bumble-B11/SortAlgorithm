/**
 * Created by bumblebee on 16/2/27.
 * 插入排序法
 */
public class InsertSort {

    public static void insertSort(int[] numArray) {
        int i;

        for (i = 1; i < numArray.length; i ++) {
            int j = i - 1;
            int temp = numArray[i];
            while (j > -1) {
                if (temp < numArray[j]) {
                    numArray[j + 1] = numArray[j];
                    numArray[j] = temp;

                }
                else {
                    break;
                }
                j --;
            }
        }
    }
}
