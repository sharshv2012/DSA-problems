package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 10 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {

            flag = 0;
            for (int j = 1; j < arr.length - i; j++) {
                // did -i as we don't need to check the last 
                //elements till i'th position from last.
                if (arr[j] < arr[j - 1]) { // > for desc order.
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = 1;
                    continue;
                } else {
                    continue;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        return arr;
    }

    // It's a stable sorting algo as when the values are same the 
    //order remains the same too.
}
