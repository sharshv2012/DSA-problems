package Recursion;

class ReversingANum{
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    static int reverse(int n){
        int digit = (int)(Math.log10(n)) + 1;
        System.out.println(digit);
        if(n%10 == n){
            return n;
        }

        return  (n%10)*(int)(Math.pow(10, (digit-1))) + reverse(n/10);

    }
}