import java.util.Arrays;

/**
 * Created by bumblebee on 16/2/28.
 */
public class QuickSort {

    public static int fenzu(int[] numArray, int start, int end) {

        int temp = numArray[start];

        while (start < end) {

            while (start < end && numArray[end] >= temp) {
                end --;
            }

            numArray[start] = numArray[end];

            while (start < end && numArray[start] < temp) {
                start ++;
            }

            numArray[end] = numArray[start];
        }

        numArray[start] = temp;

        return start;
    }

    public static void qSort(int[] numArray, int start, int end) {

        if (start < end) {
            int zuobiao = fenzu(numArray, start, end);
            qSort(numArray, start, zuobiao - 1);
            qSort(numArray, zuobiao + 1, end);
        }
    }

    public static void quickSort(int[] numArray, int start, int end) {

        qSort(numArray, start, end);
    }
}
