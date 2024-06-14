package Sorting;
// questions related to cyclic sort
// whereever u find consecutive no.s from 0 to n or 1 to n apply CS
import java.util.ArrayList;
import java.util.List;

import EnteryLevelProblems.reverse;

public class MissingNum {
    public static void main(String[] args) {
        
    }
    public static int missingNumber(int[] arr) {
        //268
        //https://leetcode.com/problems/missing-number/description/
        int i = 0;
        while(i < arr.length){ //cyclic sort
            int correct = arr[i] ;
            if(arr[i] == arr.length){
                i++;
                continue;
            }
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            /*if(arr[i] - 1 != i){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }*/ //can be done like this  too.
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }


        return arr.length;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        //448
        //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1199541847/ 
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            /*if(arr[i] - 1 != i){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }*/ //can be done like this  too.
        }

        ArrayList <Integer> answer = new ArrayList<>();

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                answer.add(j+1);
            }
        }

        return answer;
    }
    public int findDuplicate(int[] arr) {
        //287
        //https://leetcode.com/problems/find-the-duplicate-number/
        // the duplicates settle on the bottom of the array.
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            /*if(arr[i] - 1 != i){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }*/ //can be done like this  too.
        }

        return arr[arr.length - 1];
    }
    public List<Integer> findDuplicates(int[] arr) {
        //442
        //https://leetcode.com/problems/find-all-duplicates-in-an-array/
        // the duplicates settle on the bottom of the array.
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            /*if(arr[i] - 1 != i){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }*/ //can be done like this  too.
        }

        ArrayList <Integer> answer = new ArrayList<>();

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                answer.add(arr[j]);
            }
        }

        return answer;
    }
    public int[] findErrorNums(int[] arr) {
        //645
        //https://leetcode.com/problems/set-mismatch/
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            /*if(arr[i] - 1 != i){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }*/ //can be done like this  too.
        }
        int [] ans = new int[2];
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                ans[0] = ans[j];
                ans[1] = j+1;

                return ans;
            }
        }
        return ans;
    }
    public int firstMissingPositive(int[] arr) {
        //41
        //https://leetcode.com/problems/first-missing-positive/
        //though the question does'nt clears if we have to apply cyclic sort
        // but we have to find the smallest missing +ive int and our solutin 
        //should be in O(n) so we r going to apply cyclic sort.
        //we r going to ignore -ve and 0s

        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            /*if(arr[i] - 1 != i){
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }else{
                i++;
            }*/ //can be done like this  too.
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                return j+1;
            }
        }
        return arr.length + 1;
    }
}
