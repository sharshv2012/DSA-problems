
import java.util.Arrays;

class PatternsAndSimpleSort{
    public static void main(String[] args) {
        lowerTriangle(4, 0);
        System.out.println();
        upperTriange(4, 0);
        System.out.println();
        int[] arr = {3,6,4,8,1,9,1};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int[] arr1 = {4,9,7,1,0,3,7,9,3,6,5};
        selectionSort(arr1, arr1.length, 0, 0);
        System.out.println(Arrays.toString(arr1));
    }

    static void lowerTriangle(int r, int c){
        if(r==0){
            return;
        }
        if(r > c){
            System.out.print("*");
            lowerTriangle(r, c+1);
        }else{
            System.out.println();
            lowerTriangle(r-1, 0);
        }

    }

    static void upperTriange(int r, int c){
        if(r==0){
            return;
        }
        if(r > c){
            upperTriange(r, c+1); // printing after the the function call, it'll be executed once function returns from the stack.
            System.out.print("*");
        }else{
            upperTriange(r-1, 0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(r > c){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }else{
            bubbleSort(arr, r-1, 0);
        }
    }

    static void selectionSort(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(r > c){ // first finding the max element
            if(arr[c] > arr[max]){
                selectionSort(arr, r, c+1, c);
            }
            else{
                selectionSort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r-1, 0, 0);
        }
    }
}