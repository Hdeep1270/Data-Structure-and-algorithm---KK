package Searching;

public class SearchInMountainArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int key = 3;
        findingIndex(arr, key);
    }

    private static void findingIndex(int[] arr, int key) {
        int peak = peakIndex(arr);
        int FH = firstHalf(arr, 0, peak, key);
        int SH = secondHalf(arr, peak, arr.length, key);
        if(FH == -1){
            System.out.println(SH);
        }
        else{
            System.out.println(FH);
        }
    }


    public static int peakIndex(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else if (nums[mid] > nums[mid + 1]) {
                r = mid;
            }
        }
        return l;
    }

    public static int firstHalf(int[] arr, int start, int end, int key) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int secondHalf(int[] arr, int start, int end, int key) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }
}

