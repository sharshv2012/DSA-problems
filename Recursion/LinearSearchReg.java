
import java.util.ArrayList;

class LinearSearchReg{
    public static void main(String[] args) {
        int[] arr = {6,7,8,4,9,3,9};
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(searchIndices(arr, 9, 0, al));
    }

    static boolean search(int[]arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return  arr[index] == target || search(arr, target, index + 1);    
    }
    static int searchIndex(int[]arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        else if(arr[index]== target){
            return index;
        }
        return  searchIndex(arr, target, index + 1);
    }
    static ArrayList<Integer> searchIndices(int[]arr, int target, int index, ArrayList<Integer> al){
        if(index == arr.length){
            return al;
        }
        else if(arr[index]== target){
            al.add(index);
        }
        return  searchIndices(arr, target, index + 1, al);
    }
}