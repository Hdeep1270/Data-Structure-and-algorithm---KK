package Searching;

public class Binary_Search {
    public int binarySearch(int[] arr, int key) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int key = 4;

        Binary_Search bs = new Binary_Search();
        int ans = bs.binarySearch(nums, key);

        System.out.println(ans);
    }
}