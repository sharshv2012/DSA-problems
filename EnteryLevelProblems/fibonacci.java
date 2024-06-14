import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        
        Scanner fibo  = new Scanner(System.in);
        System.out.print("Enter the position of the element of the series ypu want");

        int n = fibo.nextInt();

        int a = 0;
        int b = 1;

        int count = 2;

        

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;

            count++;
        }
        System.out.println(b);

    }
}