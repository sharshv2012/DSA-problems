//1342
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class ReduceToZero{
    public static void main(String[] args) {
        System.out.println(steps(41));
    }
    static int steps(int num){
        return helper(num, 0);
    }
    static int helper(int num, int steps){ // used helper becuz we have a var for count
        if(num==0){
            return steps;
        }
        if(num%2 == 0){
            return helper(num/2, steps + 1);
        }

        return helper(num-1, steps + 1);
    }
}