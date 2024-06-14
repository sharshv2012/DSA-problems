package Searching.BinarySearch;

import java.util.Arrays;

//34
public class FirstLastPosition {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        
        

        int [] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;

        
    }
    static int search(int[] nums, int target, boolean findStartIndex ){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // if start + end exceeds the range. optimized way

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {//either u return or chng the values of start and end or it'll run infinitly.
                //potential ans found.
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }
        }
        return ans;
    }

}
