package Sorting.questions;

public class MergeSortedArray {
    public static void main(String[] args) {
        
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = nums1.length-1;
        int mid = m-1;
        int num2remaining = n-1;

        if(num2remaining == -1){
            return;
        }
        if(m == 0){
            
            nums1[0] = nums2[n-1];
            return;
        }
        if(m == n && m==1){
            if(nums1[0] > nums2[0]){
                int temp = nums1[0];
                nums1[1] = temp;
                nums1[0] = nums2[0];
            }else{
                nums1[1] = nums2[0];
            }
            return;
        }

        
        
        for(int i = end; i >= 0; i--) {
            
            if( nums2[num2remaining] > nums1[mid] && mid != i){
                nums1[i] = nums2[num2remaining];
                num2remaining--;
                if(num2remaining == -1){
                    return;
                }
            }
            else{
                nums1[i] = nums1[mid];
                nums1[mid] = nums2[num2remaining];
                mid--;
                if(mid == -1){
                    return;
                }
                 
            }
            
        }

    }

}
