package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {3,2,5,4,1,5};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] > arr[j-1]){ // < for asc order.
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                    // as the previous elements are sorted
                    // you don't need to check.
                }
            }
        }

        return arr;
    }
}
