package EnteryLevelProblems;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){

            System.out.println("Enter the number to be checked");

            int num = in.nextInt();
            
            boolean isPrime = isPrime(num);

            System.out.println(isPrime);

            
        }

    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while (n >= c*c) {// you just have to check till the sqRoot of n.
            if(n%c == 0){
                return false;
            }

            c++;

        }return n < c*c;
    }
}
