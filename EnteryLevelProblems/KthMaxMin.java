package EnteryLevelProblems;

// import java.util.ArrayList;
// import java.util.List;

public class KthMaxMin {
//Finding Kth Max and Min without sorting the array.
    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 8, 9 , 0 , 8 };

        System.out.println(KthMin(arr , 3));
        System.out.println(KthMax(arr , 3));

        // ArrayList<Integer> arl = new ArrayList<>();

        // arl.add(1);
        // arl.add(8);

        // for(int i = 0; i < arr.length; i++){

        //     if(arl.contains(arr[i])){
        //         continue;
        //     }
        //     System.out.println(i);
        // }


        

        
    }

    static int KthMin(int[] arr, int k){

        int minIndex = k;
        int maxIndex = 0;
        while(true & k < arr.length){           
            for(int i = 0 ; i < arr.length; i++){
                if(i < k ){
                    if(arr[i] > arr[maxIndex]){
                        maxIndex = i;
                    }
                }else{
                    if(arr[i] < arr[minIndex]){
                        minIndex = i;
                    }
                }
            }
            if(arr[maxIndex] > arr[minIndex]){// Swap
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[minIndex];
                arr[minIndex] = temp;
            }else{
                return arr[maxIndex];
            }

        }
        return k;
    }
    static int KthMax(int[] arr, int k){

        int minIndex = k;
        int maxIndex = 0;
        while(true & k < arr.length){           
            for(int i = 0 ; i < arr.length; i++){
                if(i < k ){
                    if(arr[i] < arr[maxIndex]){
                        maxIndex = i;
                    }
                }else{
                    if(arr[i] > arr[minIndex]){
                        minIndex = i;
                    }
                }
            }
            if(arr[maxIndex] < arr[minIndex]){// Swap
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[minIndex];
                arr[minIndex] = temp;
            }else{
                return arr[maxIndex];
            }

        }
        return k;
    }

}
