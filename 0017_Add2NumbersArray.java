import  java.util.*;
class Add2NumbersArray{
     public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> v = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++ ){
            v.put( nums[i], i );
        }
        int [] a = new int[2] ;

        for(int i = 0 ; i < nums.length ; i++ ){
            int diff = target - nums[i];
            if(v.containsKey(diff)){
                if(v.get(diff)==i){
                    continue;
                }
                else{
                    a[0] = i;
                    a[1] = v.get(diff);
                    break;
                }
            }
        }
        return a;
        
    }
}