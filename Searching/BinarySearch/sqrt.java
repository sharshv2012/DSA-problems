package Searching.BinarySearch;
//69
//https://leetcode.com/problems/sqrtx/description/
public class sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }
    public static int mySqrt(int x) {
        if(x == 0 || x ==1){
            return x;
        }
        int start = 1;
        int end = x;
        int mid = -1;
        
// here we are'nt using an array but itterating between the number and 1 
// using BS to find the SQRoot.
        while(start <= end){
            mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if((long)x < (long)mid*mid){
                end = mid - 1;
            }else if((long)x > (long)mid*mid){
                start = mid +1;
            }else{
                return mid;
            }
        }

        return end;

    }

    //367
    //https://leetcode.com/problems/valid-perfect-square/description/

    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if((long)mid*mid > (long)num){
                end = mid - 1;
            }else if((long)mid*mid < (long)num){
                start = mid +1;
            }else{
                return true;
            }
        }

        return false;
    }
    
}
