package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {12,9,14,17,10,24,35,76};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Comparing two adjacent elements in the inner loop
    // so that the last element of the array is the greatest element
    // while outer loop is used to shorten the size of the array for further sorting


    private static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
