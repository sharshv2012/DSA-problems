package Arrays;

import java.util.Arrays;
//1920
public class permutationBuildArr {
    public static void main(String[] args) {

        int [] arr = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));
        
    }
    
    public static int[] buildArray(int[] nums) {
        
        int [] arr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){

            
            arr[i] = nums[nums[i]];
        }

        System.gc(); //for garbage collection
        // for better memory utilization
        // gc increases runtime from 1ms to 3ms.
        // solution using reccursion gives 0ms solution.

        return arr;
    }
}
