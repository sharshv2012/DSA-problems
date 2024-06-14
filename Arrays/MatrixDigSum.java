package Arrays;
//1572
public class MatrixDigSum {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        
        // for(int i = 0; i < mat.length; i++){ // O(n^2)
        //     for(int j = 0; j < mat[i].length; j++){
        //         if(i == j || i+j == mat.length - 1){
        //             sum += mat[i][j];
        //         }
        //     }
        // }

        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];
            if(mat.length - 1 -i  != i){
                sum += mat[i][mat.length-1-i];
            }
            
        } //try to do these type of questions in single 
        // for loop, specially when their is an relatin between i and j.

        return sum;
    }

}
