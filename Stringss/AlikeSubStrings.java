package Stringss;

//1704
//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
public class AlikeSubStrings {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();

        // Initialize a counter to count the number of vowels
        int count1 = 0;
        int count2 = 0;

        // Iterate through each character in the string
        for (int i = 0; i < s.length()/2; i++) {
            // Check if the current character is a vowel
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count1++;
            }
        }

        for (int i = s.length()/2; i < s.length(); i++) {
            // Check if the current character is a vowel
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count2++;
            }
        }

        return count1 == count2;
    }
}
