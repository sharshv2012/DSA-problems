package Stringss;

public class Palindrom {
    public static void main(String[] args) {
        String str = "abca";
        System.out.println(isPalindrom("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
    static boolean isPalindrom(String str){
        if(str.length() == 0 || str == null){
            return true;
        }
        str = str.toLowerCase();
        for(int i = 0; i <= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 -i)){
                return false;
            }
        }
        return true;
    }













    //680
    //https://leetcode.com/problems/valid-palindrome-ii/description/

    public static boolean validPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        boolean skipped = false;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                // Try skipping left character
                if (!skipped && isPalindrome(str, left + 1, right)) {
                    skipped = true;
                    left++;
                    continue;
                }
                // Try skipping right character
                if (!skipped && isPalindrome(str, left, right - 1)) {
                    skipped = true;
                    right--;
                    continue;
                }
                // If neither option works, then it's not a valid palindrome
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
