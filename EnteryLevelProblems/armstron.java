package EnteryLevelProblems;

import java.util.Scanner;

public class armstron {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three digit no. to check if it is Armstrong");

        int num = in.nextInt();

        boolean result = isArmstrong(num);

        System.out.println(result);

        // printing all the three digit armStrong nos.
        
        for(int i = 100; i < 1000 ; i++){

            if(isArmstrong(i)){
                System.out.println(i);
            }

        }


    }

    static boolean isArmstrong(int num){
        
        int sum = 0;

        int oldNum = num;

        while (num > 0) {
            int c = num%10;

            int cube = c*c*c;

            sum += cube;

            num /= 10;
        }

        return sum == oldNum ;
        
    }
}
