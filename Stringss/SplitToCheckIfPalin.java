package Stringss;

public class SplitToCheckIfPalin {
    public static void main(String[] args) {
        System.out.println(checkPalindromeFormation("ulacfd", "jizalu"));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        a = a.toLowerCase();
        b= b.toLowerCase();
        if(isPalindrom(a)){
            return true;
        }
        if(isPalindrom(b)){
            return true;
        }
        int index = 0 ;
        for(int i = 0; i <= a.length()/2; i++){
            if(a.charAt(i) != b.charAt(b.length() - 1 -i)){
                index = i;
            }
        }
        if(index != 0){
            return true;
        }
        for(int i = 0; i <= a.length()/2; i++){
            if(b.charAt(i) != a.charAt(a.length() - 1 -i)){
                index = i;
            }
        }
        if(index != 0){
            return true;
        }
        
        

        return false;

    }
    static boolean isPalindrom(String str){
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
