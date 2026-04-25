package Searching;

public class PeakIndexInAMountainArray {
    static void main() {
        int[] nums = {21,32,41,56,59,62,57,28,17,2};
        int peak = peakIndex(nums);
        System.out.println(peak);
    }
    public static int peakIndex(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            }
            else if(nums[mid] > nums[mid + 1]) {
                r = mid;
            }
        }
        return nums[l];
    }
}
