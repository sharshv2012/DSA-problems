package Stringss;
//1528
//https://leetcode.com/problems/shuffle-string/description/
public class ShuffleStrings {
    public static void main(String[] args) {
        
    }
    public static String restoreString(String s, int[] indices) {
        char [] arr = s.toCharArray();
        char [] arrr = new char[arr.length];
        for(int i = 0; i < indices.length; i++){
            arrr[indices[i]] = arr[i];
        }

        return String.valueOf(arrr);
    }
}
