package Arrays;

import java.util.ArrayList;
import java.util.List;

//54
public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(nums));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arl = new ArrayList<>();

        // for(int i = 0; i < matrix[0].length; i++){
        //     arl.add(matrix[0][i]);
        // }

        // arl.add(matrix[1][matrix[1].length - 1]);

        // for(int j = matrix[2].length-1; j >= 0; j--){
        //     arl.add(matrix[2][j]);
        // }

        // for(int i = 0; i < matrix[1].length-1; i++){
        //     arl.add(matrix[1][i]);
        // } this will only work if the length of the matrix is 3.

        

        return arl;
    }
}
