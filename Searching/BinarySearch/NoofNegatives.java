package Searching.BinarySearch;
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class NoofNegatives {
    public static void main(String[] args) {
        int [][] arr = {{5,1,0},{-5,-5,-5}};
        System.out.println(countNegatives(arr));
    }
    public static int countNegatives(int[][] matrix) {

        int row = 0;
        
        int col = matrix[0].length -1;
        
        
        int count = 0;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] < 0){
                count++;

                if(col == 0){
                    col = matrix[0].length -1;
                    row++;
                }else{
                    col--;
                }
                
                
            }
            else{
                if(row == matrix.length -1){
                    col--;
                }else{
                    row++;
                    col = matrix[0].length -1;
                }
                
            }
            
        }
        return count;
    }
}
