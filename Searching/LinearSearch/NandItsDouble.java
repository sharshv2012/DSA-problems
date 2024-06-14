package Searching.LinearSearch;
//1346
//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
public class NandItsDouble {
    public static void main(String[] args) {
        int [] arr = {-2,0,10,-19,4,6,-8};
        System.err.println(checkIfExist(arr));
        
    }
    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && arr[i] == 0){
                    return true;
                }
                if(arr[i] == 2*arr[j] && i != j){
                    return true;
                }
            }
        }

        return false;
    }

}
