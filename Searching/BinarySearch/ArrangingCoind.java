package Searching.BinarySearch;
//441
//https://leetcode.com/problems/arranging-coins/description/

public class ArrangingCoind {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(45));
    }
    public static int arrangeCoins(int n) {
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if((long)((long)mid*(mid+1))/2 > (long)n){
                end = mid - 1;
            }else if((long)((long)mid*(mid+1))/2 < (long)n){
                start = mid +1;
            }else{
                return mid;
            }
        }
 
        return end;
    }
}
