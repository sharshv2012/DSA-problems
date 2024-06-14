package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,4,1,8,7,7};
        
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = min(arr, i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // this algo is not stable as the order of same elements can change
    // because of finding min max.
    static int max(int [] arr, int j){ // for desc order.
        int temp = 0;
        int index = 0;
        for(int i = j; i < arr.length; i++){
            if(temp < arr[i]){
                temp = arr[i];
                index = i;
            }
            
        }
        return index;
    }
    static int min(int [] arr, int j){ // for asc order.
        int temp = arr[j];
        int index = j;
        for(int i = j; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
                index = i;
            }
            
        }
        return index;
    }
}
