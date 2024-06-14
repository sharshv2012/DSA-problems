package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//566
public class MatrixReshape {
    public static void main(String[] args) {

        int[][] arr = {{1,2},{3,4}};

        int[][]ar = matrixReshape(arr, 1, 4);
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++ ) {
                System.out.println(ar[i][j]);
            }
        }
        
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        

        if(r*c == mat.length*mat[0].length){

            // Stack<Integer> stack = new Stack<> ();
        

            // for (int i = mat.length -1; i >= 0; i--) {
            //     for (int j = mat[i].length -1; j >= 0; j--) {
            //         stack.push(mat[i][j]);
            //     }
            // }

             int [][] neu = new int[r][c];

            // for(int i = 0 ; i < r; i++){
            //     for(int j = 0 ; j < c ; j++){
            //         neu[i][j] = stack.peek();
            //         stack.pop();
            //     }
            // }

            // return neu; this took 3 ms

            int l =0 , k =0;
            for(int i = 0 ; i < mat.length; i++){
                for(int j = 0 ; j < mat[0].length ; j++){
                    if(l == c){
                        l =0;
                        k++;
                    }
                    neu[k][l++] = mat[i][j];
                }

                /*
                ans[row][col] = mat[i][j];
                col++;
                if(col==c)
                {
                    col = 0;
                    row++;
                }
                */ 
            }

            return neu;

        }else{
            return mat;
        }

        
    }
}
