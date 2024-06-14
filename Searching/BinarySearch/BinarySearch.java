package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        
    }
    static int binarySearch(int[]arr, int target){ // order oriented algo
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
    static int binarySearchAgno(int[]arr, int target){ // order agnostic algo
        int start = 0;
        int end = arr.length - 1;

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
