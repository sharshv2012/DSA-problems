package Arrays;

import java.util.Arrays;

//1365
public class CompareToAll {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];
        for(int i =0 ; i < nums.length; i++){
            int count =0;
            for(int j =0 ; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;// takes 7ms


        /*
        optimized solution uses counting sort.
        //takes 1ms
          int[] count = new int[101];
        int n = nums.length;
        
        //Counting occurrences of each element:
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        
        //Calculating cumulative count:
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }
        
        int[] result = new int[n];
        
        //Building the result array:
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }
        
        return result;

        The algorithm implemented in the provided code
        is a variation of the Counting Sort algorithm,
        specifically tailored to solve the problem of
        counting the number of smaller elements to the
        right of each element in an array (nums in this case).
        */
    }
}
