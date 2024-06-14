public class varargs {
    public static void main(String[] args) {


        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
        
    }

    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
}
