package EnteryLevelProblems;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,9,8,7,4,5,0};

        System.out.println(max(arr));
        System.out.println(NthSmallest(arr, 3));
    }

    static int max(int [] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(temp < arr[i]){
                temp = arr[i];
            }
            
        }
        return temp;
    }
    static int min(int [] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
            
        }
        return temp;
    }
    static int NthSmallest(int [] arr, int n){
        int div = arr.length / n;
        
        int lb = 0;
        int ub = div;
        int count = 0;
        int min = min(arr);
        int thirdmin = 0;
        while(true){

            
            for(int i = lb; i < ub; i++){
                count++;
                if(arr[lb] > arr[i]){
                    thirdmin = arr[i];
                }else{
                    thirdmin = arr[lb];
                }
            }

            if(thirdmin > min){
                min = thirdmin;
            } 

            lb = ub;
            ub = (ub < arr.length - div) ? ub + div : arr.length;

            if(count == arr.length) break;
        }
        return min;

    }
}
