package Searching.BinarySearch;

import java.util.Arrays;
//74
public class BSfor2D {
    public static void main(String[] args) {
        int [][] arr= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        System.out.println(Arrays.toString(searchInRowColMatrix(arr, 49)));
    }
    static int[] searchInRowColMatrix(int[][] matrix , int target){
        // for case in which each row and column is sorted.
        // we are starting from comparing the top right corner element
        //to the target element, if it's smaller than target then we are 
        //jumping on the next row i.e row++; if greater then we'll jump to the 
        //previous column i.e. col--.
        int row = 0;
        int col = matrix.length -1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[] {row,col};
            }

            if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
            
        }
        return new int[]{-1,-1};
    }
}
