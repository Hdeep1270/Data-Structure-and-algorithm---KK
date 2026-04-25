package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = {4,1,5,3,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Selecting the greatest element in the inner loop
    // ans Swaping it with the last index of the array
    // While the outer loop is used to shorten the array length

    private static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int maxIndex = 0;

            // find index of maximum element
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap max element with last unsorted position
            int last = arr.length - 1 - i;

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
}
