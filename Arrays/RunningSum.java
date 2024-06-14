package Arrays;

import java.util.Arrays;


public class RunningSum {
    public static void main(String[] args) {
        

        int[] num = {2, 4, 5, 6, 7};

        //System.out.println(Arrays.toString(runningSum(num)));

        System.out.println(Arrays.toString(runSummm(num)));

        //System.out.println(Arrays.toString(runSum(num)));// this method changes the original array

        System.out.println(Arrays.toString(num));

        
    }

    static int[] runSummm (int[] num){

        int[] runningSum = new int[num.length];
        int sum = 0;
        
        for(int i = 0; i < num.length ; i++) {
            sum += num[i];
            runningSum[i] = sum;
        }
        return  runningSum;
    }

    static int[] runSum (int[] num){
        for(int i = 1; i < num.length ; i++) {
            num[i] = num[i] + num[i-1];
        }
        return  num;
    }

    static int[] runningSum(int[] nums){

        int len = nums.length;

        int[] runningSum = new int[len];
        for(int i = 0; i < nums.length ; i++) {

            for(int j= i ; j >= 0 ; j--){

                runningSum[i] += nums[j];

            }
            
        }

        return runningSum;
    }
}

