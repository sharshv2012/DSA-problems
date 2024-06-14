package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {
        Object []arr = {1, "Harsh", 5, 8, 9, 6} ;

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
    
    
    static void swap(Object [] array, int start, int end){
        Object temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

}


