package Searching.BinarySearch;

public class ReachANum {
    public static void main(String[] args) {

    }

    public static int reachNumber(int target) {
        // int start = 0;
        // int end = arr.length - 1;

        // while (start <= end) {
        //     int mid = start + (end - start) / 2; // if start + end exceeds the range. optimized way

        //     if (target < arr[mid]) {
        //         end = mid - 1;
        //     } else if (target > arr[mid]) {
        //         start = mid + 1;
        //     } else {
        //         return mid;
        //     }
        // }

        // return -1;

        int start = 0;
        if(target == 0 || target == 1){
            return target;
        }  
        for(int i = 1; i < target; i++){
            if(start < target - 1){
                start += i;
                continue;
            }
            if(start == target){
                return start;
            }
            if(start == target-)
            
        }
    }
}
