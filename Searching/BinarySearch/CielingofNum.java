package Searching.BinarySearch;
/*
 * if targrt is 14
 * we have to find a no. from the array which is just >=14
*/
public class CielingofNum {
    public static void main(String[] args) {

        int []arr = {2,3,5,7,9,17,18,24};
        System.out.println(binarySearch(arr, 6));
        
    }static int binarySearch(int[]arr, int target){ // order oriented algo
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return arr[mid];
            }
            
        }

        return arr[start];// for ceiling
        // return arr[end]; // for floor
    }
}
