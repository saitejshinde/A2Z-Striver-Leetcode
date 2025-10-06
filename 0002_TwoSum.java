
import java.util.*;

class TwoSum{
    public static void main(String args[]){

        int a [] = {1,5,58,4,3};
        int sum []= twoSum(a, 61);
        System.out.print("[ ");
        for(int i=0 ;i< sum.length; i++){

            System.out.print(sum[i]+", ");
        }

        System.out.print(" ] ");

    }
 
    public static int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>(); // value -> index
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[] {}; // if no solution found
    }
}
