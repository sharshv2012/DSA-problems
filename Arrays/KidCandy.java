package Arrays;
//1431

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidCandy {
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        for (boolean value : kidsWithCandies(arr, 2)) {
            System.out.println(value);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for(int i: candies)
        {
            if(i > max)
            {
                max = i;
            }
        }
        List<Boolean> booleanList = new ArrayList<>();

        for(int i: candies)
        {
            if(i + extraCandies >= max){
                booleanList.add(true);
            }else{
                booleanList.add(false);
            }
        }
        return booleanList;


    }
    

    
    
}
