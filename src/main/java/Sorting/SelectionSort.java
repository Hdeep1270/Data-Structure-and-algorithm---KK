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

        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.MIN_VALUE;
            int index = -1;
            for (int j = 0; j < arr.length - i; j++) {
                if(temp < arr[j]){
                    temp = arr[j];
                    index = j;
                }
            }
            int x = arr[index];
            arr[index] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = x;
        }
    }
}
