package Searching.BinarySearch;

public class SingleElement {
    public static void main(String[] args) {
        

    }
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr.length == 1){
            return arr[0];
        }else if(arr[0] != arr[1]){
            return arr[0];
        }else if(arr[arr.length -1] != arr[arr.length -2]){
            return arr[arr.length -1];
        }
        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way
            if(mid%2 == 0){
                if(arr[mid] == arr[mid-1]){
                    end = mid;
                }else if(arr[mid] == arr[mid+1]){
                    start = mid;
                }else{
                    return arr[mid];
                } 
            }else{
                if(arr[mid] == arr[mid-1]){
                    start = mid;
                }else if(arr[mid] == arr[mid+1]){
                    end = mid;
                }else{
                    return arr[mid];
                }
            }

            
        }

        return -1;
    }
}
