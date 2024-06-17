

public class CountZero{
    public static void main(String[] args) {
        int num = 1050608890;
        System.out.println(count(num));
        
    }
    static int count(int num){
        return helper(num, 0);
    }
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }

        if(num%10 == 0){
            return helper(num/10, count + 1); // if u use count++, value of count wold not incr as it returns first then increments
        }
        return helper(num/10, count);
    }
}