package Searching.LinearSearch;
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
//1608
public class SpecialArray {
    public static void main(String[] args) {
        int [] nums = {0,6,8,6,6,5};
        System.out.println(specialArray(nums));
    }
    public static  int specialArray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end -start)/2;
            int count =0;
            for(int i =0; i<nums.length; i++){
                if(nums[i] >= mid){
                    count++;
                }
            }
            if(count == mid){
                return mid;
            }else if( count > mid){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    //     int count = 0;
    //     for(int i = 1; i <= nums.length; i++){
    //         for(int j = 0; j < nums.length; j++){
    //             if(nums[j] >= i){
    //                 count++;
    //             }
                
    //         }
    //         if(count == i){
    //             break;
    //         }
    //         count = 0;
    //     }
    //     if(count == 0){
    //         return -1;
    //     }else{
    //         return count;
    //     }
    // }
}}
/*Done using binary search
 class Solution {
    public int specialArray(int[] nums) {
        int start = 1; 
        int end = nums.length;
        while(start <= end) {
            int mid = start + (end - start) / 2; 
            int count = 0; 
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= mid) {
                    count++;
                }
            }
            if (count == mid) {
                return mid;
            }
            else if(count > mid) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
*/
