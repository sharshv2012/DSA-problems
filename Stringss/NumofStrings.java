package Stringss;
//1967
//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/
public class NumofStrings {
    public static void main(String[] args) {
        
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String string : patterns) {
            if(word.contains(string)){
                count++;
            }
        }

        return count;
    }
}
