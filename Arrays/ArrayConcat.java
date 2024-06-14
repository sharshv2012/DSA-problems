package Arrays;

import java.util.Arrays;
//1929
public class ArrayConcat {

    public static void main(String[] args) {
        
        int [] arr = {3, 4, 6};

        System.out.println(Arrays.toString(getConcatenation(arr)));


    }

    public static int[] getConcatenation(int[] nums) {

        int l = nums.length;
        

        int[] arr = new int[2*l];


        for(int i = 0; i < arr.length; i++ ){
            if(i<l){
                arr[i] = nums [i];
            }else{
                arr[i] = nums[i-l];
            }
        }

        return arr;

        // this answer takes 1ms

        // below code takes 0ms as no loop is needed.

        /*
         int length = 2*nums.length;
        int ans[] = Arrays.copyOf(nums,length);

        // for(int i=0; i<ans.length; i++){
        //      ans[i] = nums[i%nums.length];
        // }
         System.arraycopy(nums, 0, ans, nums.length, nums.length);
        
        return ans
         */
    }
}