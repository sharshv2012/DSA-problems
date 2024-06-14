package Searching.BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/submissions/1182038304
//1095
public class SearchinMountainArr {
    public static void main(String[] args) {
        int [ ] arr = {0,5,3,1};
        System.out.println(findInMountainArray(1, arr));

    }
    public static int findInMountainArray(int target, int [] mountainArr) {
        return findPeak(mountainArr, target);
    }
    static int findPeak (int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid +1;
            }
        }

        int peak = start;
        if(target == arr[peak]){
            return peak;
        }
        if(binarySearch(arr, target, 0, (peak -1)) != -1){
            return binarySearch(arr, target, 0, (peak -1));
        }else{
            return binarySearch(arr, target, peak + 1, arr.length -1);
        }


    }
    static int binarySearch(int[]arr, int target, int start, int end){ // order oriented algo

        if(arr[start] > arr[end]){ // for descending
            while(start <= end){
                int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way
    
                if(target < arr[mid]){
                    start = mid +1;
                    
                }else if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
    
            return -1;
        }

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
}
