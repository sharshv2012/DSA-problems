package Stringss;

public class RemoveNonAlphaNumerics {
    public static void main(String[] args) {
        System.out.println(removeNonAlphanumeric("A man, a plan, a canal: Panama"));
    }
    public static String removeNonAlphanumeric(String str) {
        // Regular expression to match non-alphanumeric characters
        String regex = "[^a-zA-Z0-9]";
        // Replace all non-alphanumeric characters with an empty string
        return str.replaceAll(regex, "");
    }
}
