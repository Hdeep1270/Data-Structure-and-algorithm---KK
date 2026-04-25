package Searching;

public class SmallestLetterGreaterThanTarget {
    static void main() {
        char[] chars = {'c','d','f','g','j','m'};
        char key = 'e';
        char ans = ceilingletter(chars,key);
        System.out.println(ans);
    }


    public static char ceilingletter(char[] chars, char letter) {
        int l = 0;
        int r = chars.length-1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (chars[mid] == letter) {
                return chars[mid];
            }
            else if (chars[mid] > letter) {
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return chars[l];
    }
}


