package EnteryLevelProblems;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to be reversed");

        int num = in.nextInt();

        int result = 0;

        while(num != 0){

            int lastDig = num%10;

            result = result*10 + lastDig;

            num /= 10;
        }

        System.out.println(result);
    }
}
