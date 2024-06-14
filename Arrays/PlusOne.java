package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        
        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(plusOne(arr)));


    }
    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;// for general cases
            }
            digits[i] = 0;
        }
        
        digits = new int[digits.length + 1]; // for cases like{9, 9, 9...}
        digits[0] = 1;
        return digits;
    }


    public static int[] plusOnee(int[] digits) {
    // this case will only work when the array consists tnr number
    // less than max range of long.

        int len = digits.length;
        long num = 0;
        
        for(int i= 0 ; i <= len-1; i++ ){
            
            num += Math.pow(10, i) * digits[len-1-i];


        }

        num += 1;

        
        String numm = Long.toString(num);

        int [] arrr = new int[numm.length()];

        for(int i = 0; i < numm.length(); i++){
            arrr[i] = Character.getNumericValue(numm.charAt(i));
        }

        

        return arrr;
    }
}
