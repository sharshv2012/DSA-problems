package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1389
public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        
        // converting arraylist of Integer to an array of int.
        nums = list.stream().mapToInt(i -> i).toArray();

        return nums;
        // this solution took 1 or 2 ms i think because we used stream api.

        //convertion can be done like this too:
        /*
            for(int j = 0; j < nums.length; j++){
                nums[j] = list.get(j);
            }
        */


    }
}
