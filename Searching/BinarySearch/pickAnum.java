package Searching.BinarySearch;
//374
//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class pickAnum {
    public static void main(String[] args) {
        System.out.println(guessNumber(30));
    }

    static int guess(int num) {
        int pick = 24;
        if (num == pick) {
            return 0;
        } else if (num < pick) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2; // if start + end exceeds the range. optimized way

            if (guess(mid) == -1) {
                end = mid - 1;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }
}
