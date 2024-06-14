package EnteryLevelProblems;

import java.util.Scanner;

class countingOccurenceInNum {
    public static void main(String[] args) {



        int num = -1224422333; // if number can be both positive and negative.

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number you want to count: ");

        int n = in.nextInt();

        int count = 0;

        

        while(num != 0 ){
            if(num%10 == n || num%10 == -n){
                count++;
            }

            num = num/10;
        }


        System.out.println("No. occurences of digit " + n + " are "+ count);
        
        
    }
}
