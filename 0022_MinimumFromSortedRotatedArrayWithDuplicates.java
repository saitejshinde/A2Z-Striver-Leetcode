import java.util.Scanner;

class MinimumFromSortedRotatedArrayWithDuplicates {
     public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        int []a = { 7,8,9,10,1,2,3,4 };
        System.out.println(findMin(a));
    }

    public static int findMin(int[] nums) {
        int l=0, r = nums.length-1;
        int min = Integer.MAX_VALUE;
        // Set<Integer> s = new HashSet(Arrays.asList(nums));
        // int [] a = s.toArray(new Integer[0]); 
        if (nums.length == 1) {
            min = Math.min(min, nums[l]);
            return min;
        }
        while(l<=r){
            
            int mid =(l+r)/2;
            if(nums[l] < nums[mid]){

                    min = Math.min(min, nums[l]);
                    l = mid+1;
            }
            else if(nums[l] > nums[mid]) {
                min = Math.min(min, nums[mid]);
                r = mid;
            }
            else{
                min = Math.min(min, nums[l]);
                l++;
            }
        }

        return min;

    }

}
