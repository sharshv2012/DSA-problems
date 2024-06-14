package Arrays;
//744
public class SmallestLetGreaterThan {
    public static void main(String[] args) {
       

        System.out.println('j' < 'k');
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
    
        while(start <= end){
            int mid = start + (end - start)/2; //if start + end exceeds the range. optimized way
    
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        if(start%letters.length == 0){
            return letters[0];
        }
        return letters[start];
    }
}
