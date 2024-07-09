
import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            int fact = n;
            for(int i = 2; i<n; i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }
    }
}