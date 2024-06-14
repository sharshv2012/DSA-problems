package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int []arr = new int[5];



        // for (int i = 0; i < arr.length; i++ ) {
        //     System.out.println("Enter the "+i+"th number.");
        //     arr[i] = in.nextInt();
        // }

        // for (int i : arr) { // for each
        //     System.out.println(i);
        // }

        // System.out.println(Arrays.toString(arr));

        // Mutability in Java

        int[] num = new int [] {2, 4, 5, 6, 7};
        int[] mum = new int [] {2, 4, 5, 6, 7};

        System.out.println(num == mum);

        int a = 8;
        int b = 8;
        System.out.println(a==b);

        b = 4;
        System.out.println(a);
        System.out.println(a==b);

        change(num);

        System.out.println(Arrays.toString(num));// num will be changed
        // same can't be done with strings as they are immutable.

        // 2D arrays

        int arr[][] = new int [3][4]; // specifying num of rows is a must.

        for(int row =0 ; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = in.nextInt();
                
            }
            System.out.println("");
        }


        for(int row =0 ; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("");

        for(int[]i : arr){
            System.out.println(Arrays.toString(i));
        }

        System.out.println(arr); // this prints the address of arr.

        in.close();
    }

    static void change(int[] arr){
        arr[0] = 1;
    }
}
