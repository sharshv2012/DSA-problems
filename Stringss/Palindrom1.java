package Stringss;
//125
//https://leetcode.com/problems/valid-palindrome/description/
public class Palindrom1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String str) {
        
        
        // Regular expression to match non-alphanumeric characters
        String regex = "[^a-zA-Z0-9]";
        // Replace all non-alphanumeric characters with an empty string
        str = str.replaceAll(regex, "").toLowerCase();
        if(str.length() == 0 || str == null){
            return true;
        }
        for(int i = 0; i <= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 -i)){
                return false;
            }
        }
        return true;
    }
}
