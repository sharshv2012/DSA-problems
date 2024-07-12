
import java.util.Scanner;

class patternl{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in)
        int n = sc.nextInt();
        int value = 0;

        for( int i = 1; i<=n; i++)
           for ( int l =1; k<=n; k++)
                {
                    System.out.print("  ");
                }
                for( int j=i+value;j<=i;j--)
                {
                    System.out.print(j);
                }
                value += i;
            System.out.println();
    }
}