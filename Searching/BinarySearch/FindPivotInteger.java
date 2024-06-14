package Searching.BinarySearch;

public class FindPivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {

        int mid = 1 + (n - 1) / 2; // if start + end exceeds the range. optimized way
        

        for (int i = 1; i <= n; i++) {
            int tillMidSum = (mid * (mid + 1)) / 2;
            int tillendSum = (n * (n + 1)) / 2;
            int tillLeftofMidSum = ((mid - 1) * (mid)) / 2;
            int midtoEndSum = tillendSum - tillLeftofMidSum;
            if (tillMidSum == midtoEndSum) {
                return mid;
            } else if (tillMidSum < midtoEndSum) {
                mid++;
            } else {
                mid--;
            }
        }

        return -1;
        // took 2ms

        /* takes 0ms
         * int y = n*(n+1)/2;
        int x = (int)Math.sqrt(y);
        if(x*x==y) return x;
        else return -1;
        */
    }

}
