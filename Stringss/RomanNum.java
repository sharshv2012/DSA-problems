package Stringss;

public class RomanNum {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(i != s.length() - 1 && num(s.charAt(i)) < num(s.charAt(i + 1))){
                count = count - num(s.charAt(i));
            }
            else{
                count = count + num(s.charAt(i));
            }
        }

        return count;
    }
    public static int num(char a){
        switch (a) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
