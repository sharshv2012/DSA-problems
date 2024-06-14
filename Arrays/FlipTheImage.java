package Arrays;
//832


public class FlipTheImage {
    public static void main(String[] args) {
        int [][] sample = {{1,1,0},{1,0,1},{0,0,0}};
        int [][] ans = flipAndInvertImage(sample);

        for(int i = 0 ; i < ans.length ; i++){
            for(int j = 0; j < ans[i].length; j++ ){
                System.out.println(ans[i][j]);
            }
            System.out.println("***");
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {

        int[][] mew = new int[image.length][image[0].length];
        for(int i = 0 ; i < image.length ; i++){
            for(int j = image[i].length-1; j >= 0; j-- ){
                mew[i][mew[i].length-1-j] = image[i][j]^1;
            }
        }

        return mew;

        /*
            int m=image.length;
        int n=image[0].length;
        

        for(int i=0;i<m;i++){
            for(int j=0;j<(n+1)/2;j++){
               int temp=image[i][j];
               image[i][j]=image[i][n-1-j]^1;
               image[i][n-1-j]=temp^1;
            }
        }
        return image;

        0ms solution
        */
    }
}
