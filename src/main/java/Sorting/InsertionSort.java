package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        int[] arr = {4,1,5,3,2,9,34,16,7};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Refer video to revise the logic.
    // In the first loop, it will run for n-2 times as it take the element at no. 1, 2 ,3.... to the
    // farthest index if they are grater when the comparison made with the i + 1 element in the second loop.
    // While the second loop is used for swaping.

    private static void insertion(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++ ) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else break;
                }
        }
    }
}
