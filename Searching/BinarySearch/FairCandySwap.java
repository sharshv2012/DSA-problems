package Searching.BinarySearch;

import EnteryLevelProblems.reverse;

//888
//https://leetcode.com/problems/fair-candy-swap/description/

// can be done using HAshMAp 
public class FairCandySwap {
    public static void main(String[] args) {
        
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int [] ans = new int[2];

        int sumAlice = sum(aliceSizes);
        int sumBob = sum(bobSizes);

        int median = (sumAlice + sumBob)/2;
        int Aneeds = sumAlice - median;
        int Bneeds = sumBob -median;

        if(Aneeds == Bneeds){
            ans[0] = 0;
            ans[1] = 1;
            return ans;
        }

         


    } 
    static int sum(int[] arr){
        int ans = 0;
        for(int i =0; i < arr.length; i++){
            ans += arr[i];
        }
        return ans;
    }
}

