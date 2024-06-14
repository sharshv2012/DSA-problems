package Stringss;
//1662
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class IfTwoStringsAreEqvi {
    public static void main(String[] args) {
        String [] one = {"ab", "c"};
        String [] two = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(one, two));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        System.out.println(str1);
        String str2 = String.join("", word2);
        System.out.println(str2);

        return str1.equals(str2);
    }
}
