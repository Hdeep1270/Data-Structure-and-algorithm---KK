package Searching;

public class CeilingOfaNumber {
    static void main() {
        int[] nums = {1,2,4,5,6,21,43,53};
        int key = 20;
        int ans = ceiling(nums, key);
        System.out.println(ans);
    }

    static int ceiling(int[] nums, int key) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            else if (nums[mid] < key) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return nums[l];
    }
}
