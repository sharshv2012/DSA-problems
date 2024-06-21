class LinearSearchReg{
    public static void main(String[] args) {
        int[] arr = {6,7,8,4,9,3};
        System.out.println(searchIndex(arr, 9, 0));
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
}