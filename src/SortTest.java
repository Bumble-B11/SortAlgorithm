/**
 * Created by bumblebee on 16/2/27.
 */
public class SortTest {

    public static void main(String[] args) {
//        int[] numArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] numArray = {3, 4, 2, 6, 1, 1, 0, -1};

        for (int i : numArray) {
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");

//        SelectSort.selectSort(numArray);
//        InsertSort.insertSort(numArray);
//        BubbleSort.bubbleSort(numArray);
//
//
        ShellSort.shellSort(numArray);
//
//         QuickSort.quickSort(numArray, 0, numArray.length - 1);

//        MergeSort.mergeSort(numArray);
        for (int i : numArray) {
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");

    }
}
