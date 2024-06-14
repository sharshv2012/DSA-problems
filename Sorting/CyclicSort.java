package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,8,2,3,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    static int[] cyclicSort(int[] arr){

        
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            /*if(arr[i] - 1 != i){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }*/ //can be done like this  too.
        }
        return arr;
    }
}
