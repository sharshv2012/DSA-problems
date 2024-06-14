package Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int [] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        
        int count = 0;

        // for(int i = 0; i < nums.length; i++){
        //     int num = nums[i];
        //     if(num < 0){
        //         num *= -1;
        //     }
        //     if(((int)(Math.log10(num)) + 1)  % 2 == 0){ 
        //         // we can deduce no. of digits by this method.
        //         count++;
        //     }// 1ms
        // }

        for (int i : nums) {
            if(i < 0){
                i *= -1;
            }
            if(((int)(Math.log10(i)) + 1)  % 2 == 0){ 
                // we can deduce no. of digits by this method.
                count++;
            }// 1ms  
        }

        return count;
    }
}
