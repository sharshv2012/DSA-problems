package Searching.LinearSearch;
//1539
//https://leetcode.com/problems/kth-missing-positive-number/
public class kthMin {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr, 5));
    }

    //bhery nice ques and logic.
    public static int findKthPositive(int[] arr, int k) {
        for(int ans : arr) 
        {
            if(ans<=k)
                k++;
            else
                break;
        }
        return k;

    }

    
}



