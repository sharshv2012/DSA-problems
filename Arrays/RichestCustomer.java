package Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,2,1,5}};

        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){           
            int num = 0;
            for(int j = 0; j < accounts[i].length; j++){
                num += accounts[i][j];
            }
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
