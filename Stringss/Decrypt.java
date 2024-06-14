package Stringss;
//1309
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
public class Decrypt {
    public static void main(String[] args) {
        
    }
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length()-1; i >= 0; i--) {
            int number;
            if(s.charAt(i) == '#') { // If it is a two-digit number
                number = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                i-=2;
            } else { // If it is a single-digit number 
                number = s.charAt(i) - '0';
            }
            // Convert the numeric value to its alphabetic representation
            sb.append((char) (number + 96));
        }

        return sb.reverse().toString();
    }

}
