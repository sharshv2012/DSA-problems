package Searching.BinarySearch;
//35
//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }

        return start;
    }
}













/*
 * static int binarySearch(int[]arr, int target){ // order oriented algo
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }

        return -1;
    }
*/