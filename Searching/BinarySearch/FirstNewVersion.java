package Searching.BinarySearch;

public class FirstNewVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(20));
    }
    static boolean isBadVersion(int num){
        int lastBadVersion = 9;
        if(num >= lastBadVersion){
            return true;
        }else{
            return false;
        }
    }
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way

            if(isBadVersion(mid)){
                end = mid - 1;
            }else if(!isBadVersion(mid)){
                start = mid +1;
            }
            
        }

        return start;
    }
}
