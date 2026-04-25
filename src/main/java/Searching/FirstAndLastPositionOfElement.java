package Searching;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    static void main() {
        int[] nums = {2,3,4,5,5,5,5,5,5,5,6,7,8,9};
        int key = 5;
        int first = firstoccurance(nums,key);
        int last = lastoccurance(nums,key);
        int[] arr = {first,last};
        System.out.println(Arrays.toString(arr));
    }




    public static int firstoccurance(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        int possibleAns = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == key) {
             possibleAns = mid;
             end = mid - 1;
            }
            else if (nums[mid] < key) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return possibleAns;
    }





    public static int lastoccurance(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        int possibleAns = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == key) {
                possibleAns = mid;
                start = mid + 1;
            }
            else if (nums[mid] < key) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return possibleAns;
    }
}
