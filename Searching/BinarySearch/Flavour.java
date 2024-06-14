package Searching.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flavour {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(9);


        System.out.println(Arrays.toString(giveOut(arr, 9).toArray()));
        
    }
    static List<Integer> giveOut(List<Integer> arr, int k){

        int start = 0; 
        int end = arr.size() -1;
        List<Integer> result = new ArrayList<>();
        while(start <= end) {
            int mid = start + (end - start) / 2; 
            if(arr.get(mid) < k){
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) + arr.get(mid) == k) {
                        if(mid < i){
                            result.add(mid + 1);
                            result.add(i + 1);
                        }else{
                            result.add(i + 1);
                            result.add(mid + 1);
                        }
                        
                        return result;
                    }
                }
                
                
            }
            else{
                end = mid -1;
            }
            
        }
        return result;
    } 
   


}
